package com.example;

import java.util.ArrayList;
import java.util.List;

public class UniversidadePatopolis {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAlunoStricto(StrictoSensu aluno) {
        alunos.add(aluno);
    }

    public void adicionarAlunoLacto(LactoSenso aluno) {
        alunos.add(aluno);
    }

    public void adicionarAlunoGraduacao(AlunoGraduacao aluno) {
        alunos.add(aluno);
    }

    public int getTotalAlunos() {
        return alunos.size();
    }

    public void relatorioAlunosPorCurso() {
        for (Aluno aluno : alunos) {
            System.out.println("\nNome: " + aluno.getNome() + ", Curso: " + aluno.getCurso().getNome() + ", Departamento: " + aluno.getCurso().getDepartamento());
            if (aluno instanceof AlunoGraduacao) {
                System.out.println("Tipo: " + "Graduação " + "TCC: " + ((AlunoGraduacao) aluno).getTCC() + " Conceito: " + aluno.getConceito());
            } else if (aluno instanceof LactoSenso) {
                System.out.println("Tipo: " + "LactoSenso " + "Monografia: " + ((LactoSenso) aluno).getMonografia() + " Conceito: " + aluno.getConceito());
            } else if (aluno instanceof StrictoSensu) {
                System.out.println("Tipo: " + "StrictoSenso " + "Tese: " + ((StrictoSensu) aluno).getTese() + " Conceito: " + aluno.getConceito());
            }
            if (aluno.getConceito().contains("Repro")) System.out.println("Taxa reprovação: " + aluno.getTaxaReprovacao());
        }
    }

    public int getTotalReprovados() {
        int count = 0;
        for (Aluno aluno : alunos) {
            if ((aluno instanceof AlunoGraduacao && ((AlunoGraduacao) aluno).getConceito().equals("Reprovado")) ||
                    (aluno instanceof LactoSenso && ((LactoSenso) aluno).getConceito().equals("Reprovado")) ||
                    (aluno instanceof StrictoSensu && ((StrictoSensu) aluno).getConceito().equals("Reprovado"))) {
                count++;
            }
        }
        return count;
    }

    public void maiorNotaPorTipo() {
        AlunoGraduacao maiorGraduacao = null;
        LactoSenso maiorLactuSenso = null;
        StrictoSensu maiorStrictuSenso = null;

        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                if (maiorGraduacao == null || aluno.getMedia() > maiorGraduacao.getMedia()) {
                    maiorGraduacao = (AlunoGraduacao) aluno;
                }
            } else if (aluno instanceof LactoSenso) {
                if (maiorLactuSenso == null || aluno.getMedia() > maiorLactuSenso.getMedia()) {
                    maiorLactuSenso = (LactoSenso) aluno;
                }
            } else if (aluno instanceof StrictoSensu) {
                if (maiorStrictuSenso == null || aluno.getMedia() > maiorStrictuSenso.getMedia()) {
                    maiorStrictuSenso = (StrictoSensu) aluno;
                }
            }
        }

        if (maiorGraduacao != null) {
            System.out.println("Maior nota Graduacao: " + maiorGraduacao.getNome() + " com media: " + maiorGraduacao.getMedia() + " e conceito: " + maiorGraduacao.getConceito());
        }
        if (maiorLactuSenso != null) {
            System.out.println("Maior nota Lactu Senso: " + maiorLactuSenso.getNome() + " com media: " + maiorLactuSenso.getMedia() + " e conceito: " + maiorLactuSenso.getConceito());
        }
        if (maiorStrictuSenso != null) {
            System.out.println("Maior nota Strictu Senso: " + maiorStrictuSenso.getNome() + " com media: " + maiorStrictuSenso.getMedia() + " e conceito: " + maiorStrictuSenso.getConceito());
        }
    }

    public void alunosEmExame() {
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao && ((AlunoGraduacao) aluno).getConceito().equals("Exame")) {
                System.out.println("Aluno em Exame: " + aluno.getNome() + ", Curso: " + aluno.getCurso().getNome());
            }
        }
    }
}
