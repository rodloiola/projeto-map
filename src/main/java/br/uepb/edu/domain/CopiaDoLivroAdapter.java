package br.uepb.edu.domain;

public class CopiaDoLivroAdapter { // EU NAO SEI SE AQUI EXTENDS COMDOLIVRO
    private CopiaDoLivro CopiaDoLivro;

    public CopiaDoLivroAdapter(CopiaDoLivro copiaDoLivro) {
        this.CopiaDoLivro = copiaDoLivro;
    }

    public void setSituacao(String situacao) {
        if (situacao.equals("DISPONIVEL")) {
            CopiaDoLivro.setSituacao(CopiaDoLivroSituacao.DISPONIVEL);
        } else if (situacao.equals("INDISPONIVEL")) {
            CopiaDoLivro.setSituacao(CopiaDoLivroSituacao.INDISPONIVEL);
        }
    }
}

