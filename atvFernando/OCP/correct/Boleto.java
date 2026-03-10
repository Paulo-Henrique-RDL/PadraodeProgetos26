package OCP.correct;

public class Boleto implements PaymentMethod {
    @Override
    public double calcularPagamento(double valor) {
        return valor * 1.02; // 2% de taxa para boleto
    }
}

