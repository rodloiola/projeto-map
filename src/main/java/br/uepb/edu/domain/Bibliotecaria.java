package br.uepb.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Bibliotecaria {
    private static Bibliotecaria instance;
    private String nome;

    private Bibliotecaria(String nome) {
        this.nome = nome;
    }

    public static Bibliotecaria getInstance(String nome) {
        if (instance == null) {
            instance = new Bibliotecaria(nome);
        }
        return instance;
    }
}
