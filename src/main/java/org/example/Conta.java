package org.example;

public class Conta {

    private String titular;
    private boolean ativa;

    public Conta(String titular, boolean ativa) {
        this.titular = titular;
        this.ativa = ativa;
    }

    public String getTitular() {
        return titular;
    }

    public boolean isAtiva() {
        return ativa;
    }
}