package LSP.incorrect;

abstract class PaymentMethod {
    public abstract void processarPagamento(double valor);
    public abstract void estornarPagamento(); // aqui começa o erro, pois se uma classe herda outra, ela deve ser capaz de fazer tudo que a classe pai faz sem ficar com exceções
}

class CartaoCreditoViolacao extends PaymentMethod {
    @Override
    public void processarPagamento(double valor) { System.out.println("Pagamento via Cartão."); }
    
    @Override
    public void estornarPagamento() { System.out.println("Estorno realizado no Cartão."); }
}

class BoletoViolacao extends PaymentMethod {
    @Override
    public void processarPagamento(double valor) { System.out.println("Gerando Boleto."); }

    @Override
    public void estornarPagamento() {
        // aqui, o boleto não pode ser estornado diretamente, quebrando o comportamento esperado da classe
        throw new RuntimeException("Não é possível estornar um boleto automaticamente!");
    }
}
