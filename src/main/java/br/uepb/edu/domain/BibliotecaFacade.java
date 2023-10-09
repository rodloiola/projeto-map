package br.uepb.edu.domain;

public class BibliotecaFacade {
    private Bibliotecaria bibliotecaria;
    private LeitorFactory leitorFactory;
    private EmprestimoComposite emprestimoComposite;

    public BibliotecaFacade() {
        bibliotecaria = Bibliotecaria.getInstance("Maria");
        leitorFactory = new LeitorFactory();
        emprestimoComposite = new EmprestimoComposite();
    }

}
