package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Agencia implements Iterable<Conta> {

    private List<Conta> contas = new ArrayList<>();

    public Agencia(Conta... contas) {
        this.contas = Arrays.asList(contas);
    }

    @Override
    public Iterator<Conta> iterator() {
        return contas.iterator();
    }

    public static int contarContasAtivas(Agencia agencia) {
        int quantidade = 0;
        for (Conta conta : agencia) {
            if (conta.isAtiva()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int contarTotalContas(Agencia agencia) {
        int quantidade = 0;
        for (Iterator<Conta> it = agencia.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
