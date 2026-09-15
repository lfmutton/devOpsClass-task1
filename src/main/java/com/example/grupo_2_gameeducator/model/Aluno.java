package com.example.grupo_2_gameeducator.model;

public class Aluno {

    private double media;
    private int cursosLiberados;
    private int cursosNaoLiberados;
    private boolean plataformaCongelada;
    private boolean acessoAoCurso = true;
    private Mensalidade mensalidade;

    public Aluno() {
    }

    public Aluno(double media) {
        this.media = media;
    }

    public Aluno(double media, Mensalidade mensalidade) {
        this.media = media;
        this.mensalidade = mensalidade;
    }

    public void finalizarCurso(Curso curso) {
//        if (mensalidade != null && mensalidade.isPendente()) {
//            acessoAoCurso = false;
//            plataformaCongelada = true;
//            return;
//        }
//
//        if (media >= 7.0) {
//            cursosLiberados = 3;
//        }
        throw new UnsupportedOperationException("Ainda não implementado");
    }

    public double getMedia() {
        return media;
    }

    public int getCursosLiberados() {
        return cursosLiberados;
    }

    public int getCursosNaoLiberados() {
        return cursosNaoLiberados;
    }

    public boolean temAcessoAoCurso() {
        return acessoAoCurso;
    }

    public boolean isPlataformaCongelada() {
        return plataformaCongelada;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }
}
