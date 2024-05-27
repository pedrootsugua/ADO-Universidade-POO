package com.example;

public class Main {
    public static void main(String[]args){

        UniversidadePatopolis universidade = new UniversidadePatopolis();

        Curso fisica = new Curso("Fisica", "Ciências Exatas");
        Curso matematica = new Curso("Matematica", "Ciências Exatas");

        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("João Pedro", 32, fisica, "TCC do João", 9.5));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Moisés da Silva", 21, matematica,"TCC do Moisés", 4.25));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Joaquim Alvez", 25, fisica,"TCC do Joaquim", 3.65));
        universidade.adicionarAlunoGraduacao(new AlunoGraduacao("Lucca Modric", 41, matematica,"TCC do Lucca", 2.75));
        universidade.adicionarAlunoLacto(new LactoSenso("Matheus Pereira", 20, fisica, "Monografia de Matheus", 5.40));
        universidade.adicionarAlunoLacto(new LactoSenso("Juliana Moreira", 26, matematica, "Monografia de Juliana", 6.95));
        universidade.adicionarAlunoStricto(new StrictoSensu("Beatriz Alvez",19, fisica, "Tese de Beatriz", 8.80));
        universidade.adicionarAlunoStricto(new StrictoSensu("Vinicius Junior",23, matematica, "Tese de Vinicius", 7.50));

        System.out.println("\nTotal de alunos: " + universidade.getTotalAlunos());
        universidade.relatorioAlunosPorCurso();

        System.out.println("\nTotal de alunos reprovados: " + universidade.getTotalReprovados());
        universidade.maiorNotaPorTipo();

        System.out.println("\nAlunos em exame:");
        universidade.alunosEmExame();
    }
}