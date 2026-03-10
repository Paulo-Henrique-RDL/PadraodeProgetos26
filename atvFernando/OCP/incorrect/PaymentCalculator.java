package OCP.incorrect;

class PaymentCalculator {
    public double calcularPagamento(String tipoPagamento, double valor) {
        // aqui começa o erro, pois a classe precisa ser modificada sempre que um novo tipo de pagamento é adicionado, violando o princípio OCP (Aberto para extensão, fechado para modificação)
        if (tipoPagamento.equals("cartao")) {
            return valor * 1.05; // 5% de taxa
        } else if (tipoPagamento.equals("boleto")) {
            return valor * 1.02; // 2% de taxa
        } else if (tipoPagamento.equals("pix")) {
            return valor; // sem taxa
        }
        // Para adicionar um novo método de pagamento, precisaríamos modificar esta classe
        return valor;
    }
}

