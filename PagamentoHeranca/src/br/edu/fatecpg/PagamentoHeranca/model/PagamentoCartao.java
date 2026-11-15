package br.edu.fatecpg.PagamentoHeranca.model;

public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor + (valor * 0.05);
    }

    @Override
    public String emitirRecibo() {
        return "----- RECIBO CARTÃO -----\n"
                + "Valor original: R$ " + valor + "\n"
                + "Taxa de 5%: R$ " + (valor * 0.05) + "\n"
                + "Valor final: R$ " + calcularPagamento();
    }
}
