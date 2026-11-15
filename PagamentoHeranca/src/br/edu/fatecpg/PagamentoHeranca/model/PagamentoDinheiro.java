package br.edu.fatecpg.PagamentoHeranca.model;

public class PagamentoDinheiro implements Pagamento {

    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor - (valor * 0.10);
    }

    @Override
    public String emitirRecibo() {
        return "----- RECIBO DINHEIRO -----\n"
                + "Valor original: R$ " + valor + "\n"
                + "Desconto de 10%: R$ " + (valor * 0.10) + "\n"
                + "Valor final: R$ " + calcularPagamento();
    }
}