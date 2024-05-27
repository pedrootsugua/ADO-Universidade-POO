package com.example;

public class Curso {
    private String nome;
    private int duracao;
    private String departamento;

    public Curso(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }
}
