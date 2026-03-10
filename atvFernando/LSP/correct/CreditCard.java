package LSP.correct;

public class CreditCard implements PaymentMethod, Refund {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão processado."); // precisa de processar o pagamento, aqui ficaria a logica que chama a classe especifica que faz isso
    }

    @Override
    public void estornarPagamento() {
        System.out.println("Estorno realizado no Cartão."); // precisa do reembolso, aqui ficaria a logica que chama a classe especifica que faz isso
    }
}