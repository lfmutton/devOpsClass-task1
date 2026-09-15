package com.example.grupo_2_gameeducator.model;

public class Mensalidade {

    private StatusMensalidade status;

    public Mensalidade(StatusMensalidade status) {
        this.status = status;
    }

    public StatusMensalidade getStatus() {
        return status;
    }

    public boolean isPendente() {
        return status == StatusMensalidade.PENDENTE;
    }
}
