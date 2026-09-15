package com.example.grupo_2_gameeducator.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlunoCursoTest {

    //Mute
    @Test
    void quandoIniciadoUmCurso() {
        // DADO
        var curso = new Curso();
        var aluno = new Aluno(8.0);

        // QUANDO
        aluno.finalizarCurso(curso);

        // ENTÃO
        assertFalse(curso.isFinalizado());
    }

    //Will
    @Test
    void deveBloquearAcessoQuandoMensalidadeNaoForPaga() {
        // DADO
        var curso = new Curso();
        var mensalidade = new Mensalidade(StatusMensalidade.PENDENTE);
        var aluno = new Aluno(8.0, mensalidade);

        // QUANDO
        aluno.finalizarCurso(curso);

        // ENTÃO
        assertFalse(aluno.temAcessoAoCurso());
        assertTrue(aluno.isPlataformaCongelada());
    }
}