package LSP.correct;

public class Boleto implements PaymentMethod {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando Boleto para pagamento."); // como boleto nao tem estorno diretamente, ele apenas nao precisa chamar a funcao que faz isso, simples
    }

}
