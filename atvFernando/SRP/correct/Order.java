public class Order {
    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void calcularDesconto(double porcentagem) {
        this.valorTotal -= (this.valorTotal * porcentagem / 100);
    }
}