package OCP.correct;

public class Pix implements PaymentMethod {
    @Override
    public double calcularPagamento(double valor) {
        return valor; // sem taxa para PIX
    }
}

