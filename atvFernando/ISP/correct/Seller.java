package ISP.correct;
// aqui o vendedor so implementa as interfaces que fazem sentido para ele
public class Seller implements Service, Logistics {
    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente no balcão.");
    }

    @Override
    public void organizarEstoque() {
        System.out.println("Organizando prateleiras da loja.");
    }
    
}
