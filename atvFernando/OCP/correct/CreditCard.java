package OCP.correct;

public class CreditCard implements PaymentMethod {
    @Override
    public double calcularPagamento(double valor) {
        return valor * 1.05; // 5% de taxa para cartão
    }
}

