package com.example;

public class LactoSenso extends AlunoPosGraduacao implements Taxa{

    private String monografia;

    public LactoSenso(String nome, int idade, Curso curso, String monografia, Double media) {
        super(nome, idade, curso, media);
        this.monografia = monografia;
        this.taxaReprovacao = 0D;
        this.conceito = calcularConceito(media);
    }

    protected String calcularConceito(Double media) {
        if (media >= 5) return "Aprovado";
        else{
            taxaReprovacao = TAXA;
            return "Reprovado";
        }
    }

    public String getMonografia() {
        return monografia;
    }
}
