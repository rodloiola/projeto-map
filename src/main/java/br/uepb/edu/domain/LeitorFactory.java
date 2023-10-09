package br.uepb.edu.domain;

import java.util.List;

public class LeitorFactory {
    public Leitor criarLeitor(String nome, LeitorTipo tipo, List<Reserva> reservas) {
        return new Leitor(nome, tipo, reservas);
    }
}
