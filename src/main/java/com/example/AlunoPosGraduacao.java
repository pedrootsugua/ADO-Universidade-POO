package com.example;

public abstract class AlunoPosGraduacao extends Aluno{

    protected int duracao;

    public AlunoPosGraduacao(String nome, int idade, Curso curso, Double media) {
        super(nome, idade, curso);
        this.media = media;
        this.taxaReprovacao = 0D;
        this.conceito = calcularConceito(media);
    }

    public int getDuracao() {
        return duracao;
    }
}
