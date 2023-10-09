package br.uepb.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    private int periodo;
    private ReservaSituacao situacao;   
    private CopiaDoLivro copiaDoLivro;

    // Classe interna aplicando o padrão Builder
    public static class Builder {
        private int periodo;
        private ReservaSituacao situacao;
        private CopiaDoLivro copiaDoLivro;

        public Builder periodo(int periodo) {
            this.periodo = periodo;
            return this;
        }

        public Builder situacao(ReservaSituacao situacao) {
            this.situacao = situacao;
            return this;
        }

        public Builder copiaDoLivro(CopiaDoLivro copiaDoLivro) {
            this.copiaDoLivro = copiaDoLivro;
            return this;
        }

        public Reserva build() {
            return new Reserva(periodo, situacao, copiaDoLivro);
        }
    }
}
