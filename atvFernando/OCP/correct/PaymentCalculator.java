package OCP.correct;

public class PaymentCalculator {
    public double calcularPagamento(PaymentMethod method, double valor) {
        // agora, a classe não precisa ser modificada para adicionar novos métodos de pagamento
        // basta criar uma nova classe que implemente a interface PaymentMethod
        // seguindo o princípio OCP (Aberto para extensão, fechado para modificação)
        return method.calcularPagamento(valor);
    }
}

