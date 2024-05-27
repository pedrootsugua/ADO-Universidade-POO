package com.example;

public class AlunoGraduacao extends Aluno implements Taxa{

    private String tcc;

    public AlunoGraduacao(String nome, int idade, Curso curso, String tcc, Double media) {
        super(nome, idade, curso);
        this.tcc = tcc;
        this.media = media;
        this.taxaReprovacao = 0D;
        this.conceito = calcularConceito(media);
    }

    protected String calcularConceito(Double media) {
        if (media >= 5) return "Aprovado";
        else if (media >= 3.5) return "Exame";
        else{
            taxaReprovacao = TAXA;
            return "Reprovado";
        }
    }
    public String getTCC() {
        return tcc;
    }
}
