package com.example;

public class StrictoSensu extends AlunoPosGraduacao implements Taxa{

    private String tese;

    public StrictoSensu(String nome, int idade, Curso curso, String tese, Double media) {
        super(nome, idade, curso, media);
        this.tese = tese;
        this.taxaReprovacao = 0D;
        this.conceito = calcularConceito(media);
    }

    protected String calcularConceito(Double media) {
        if (media >= 7) return "Pleno";
        else return "Simplesmente";
    }

    public String getTese() {
        return tese;
    }
}
