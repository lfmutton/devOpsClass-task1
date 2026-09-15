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

    //Mute
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

    //Will
    @Test
    void deveLiberarCursosQuandoMensalidadeEstaPaga() {
        // DADO
        var curso = new Curso();
        var mensalidade = new Mensalidade(StatusMensalidade.PAGA);
        var aluno = new Aluno(8.0, mensalidade);

        // QUANDO
        aluno.finalizarCurso(curso);

        // ENTÃO
        assertTrue(aluno.temAcessoAoCurso());
        assertFalse(aluno.isPlataformaCongelada());
        assertEquals(3, aluno.getCursosLiberados());
    }

    // Aliffer
    @Test
    void deveLiberarTresCursosAoFinalizarCursoComMediaAcimaDeSete() {
        // DADO
        var curso = new Curso();
        var aluno = new Aluno(8.0);

        // QUANDO
        aluno.finalizarCurso(curso);

        // ENTÃO
        assertEquals(3, aluno.getCursosLiberados());
    }

    //Lucas
    @Test
    void naoDeveLiberarCursosAoFinalizarCursoComMediaAbaixoDeSete() {
        // DADO
        var curso = new Curso();
        var aluno = new Aluno(5.0);

        // QUANDO
        aluno.finalizarCurso(curso);

        // ENTÃO
        assertEquals(0, aluno.getCursosNaoLiberados());
    }
}