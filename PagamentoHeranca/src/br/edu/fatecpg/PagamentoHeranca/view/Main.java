package br.edu.fatecpg.PagamentoHeranca.view;
import br.edu.fatecpg.PagamentoHeranca.model.*;

public class Main {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(100);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100);

        System.out.println(cartao.emitirRecibo());

        System.out.println();

        System.out.println(dinheiro.emitirRecibo());
    }
}