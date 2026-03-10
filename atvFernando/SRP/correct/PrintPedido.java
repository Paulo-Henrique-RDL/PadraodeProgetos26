public class PrintPedido {
    public void imprimirCupomFiscal(Order pedido) {
        System.out.println("Imprimindo cupom fiscal para o valor: " + pedido.getValorTotal());
    }
}