package com.example.grupo_2_gameeducator.model;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Instituto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
