public class Pedido {
    private double valorTotal;

    public void calcularDesconto(double porcentagem) {
        this.valorTotal -= (this.valorTotal * porcentagem / 100);
    }

    public void imprimirCupomFiscal() {
        // aqui, suponhamos que tenha toda a logica de umprimir o cupom fiscal
        System.out.println("Imprimindo cupom fiscal do pedido..."); // o principio e quebrado pois a classe Pedido não deveria saber como imprimir um cupom fiscal
    }

    public void salvarNoBanco() {
        // e aqui, suponhamos que tenha toda a logica para salvar no banco
        System.out.println("Salvando pedido no banco de dados via SQL..."); // aqui a mesma coisa, ela deveria chamar outra funcao que fica responsável por salvar o pedido no banco de dados
    }
}