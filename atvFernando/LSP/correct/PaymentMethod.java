package LSP.correct;

public interface PaymentMethod {
    void processarPagamento(double valor); // aqui e a interface base, toda forma de pagamento adicionada ao sistema usara a logica contida aqui para processar o pagamento
}
