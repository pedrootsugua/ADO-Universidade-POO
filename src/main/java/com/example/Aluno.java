package com.example;

public abstract class Aluno{
    protected String nome;
    protected int idade;
    protected String conceito;
    protected Double media;
    protected Double taxaReprovacao;
    protected Curso curso;

    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    protected abstract String calcularConceito(Double media);

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getConceito() {
        return conceito;
    }

    public Double getTaxaReprovacao() {
        return taxaReprovacao;
    }

    public double getMedia() {
        return media;
    }
}
