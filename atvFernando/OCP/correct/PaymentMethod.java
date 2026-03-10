package OCP.correct;

public interface PaymentMethod {
    double calcularPagamento(double valor); // aqui, definimos o contrato para calcular o pagamento, permitindo adicionar novos métodos sem modificar classes existentes
}

