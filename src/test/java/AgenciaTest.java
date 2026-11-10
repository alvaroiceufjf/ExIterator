package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgenciaTest {

    @Test
    void deveContarContasAtivasNaAgencia() {
        Agencia agencia = new Agencia(
                new Conta("João", true),
                new Conta("Maria", false),
                new Conta("Carlos", true)
        );

        assertEquals(2, Agencia.contarContasAtivas(agencia));
    }

    @Test
    void deveContarTotalDeContasNaAgencia() {
        Agencia agencia = new Agencia(
                new Conta("João", true),
                new Conta("Maria", false),
                new Conta("Carlos", true)
        );

        assertEquals(3, Agencia.contarTotalContas(agencia));
    }
}