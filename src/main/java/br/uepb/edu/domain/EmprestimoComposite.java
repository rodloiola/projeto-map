package br.uepb.edu.domain;

import java.util.*;

public class EmprestimoComposite {
    private List<Emprestimo>Emprestimos = new ArrayList<>();

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        Emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        Emprestimos.remove(emprestimo);
    }

    public List<Emprestimo> getEmprestimos() {
        return Emprestimos;
    }
}
