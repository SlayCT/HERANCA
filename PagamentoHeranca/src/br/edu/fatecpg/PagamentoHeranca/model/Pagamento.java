package br.edu.fatecpg.PagamentoHeranca.model;

public interface Pagamento {
    double calcularPagamento();
    String emitirRecibo();
}