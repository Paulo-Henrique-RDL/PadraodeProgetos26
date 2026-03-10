package ISP.incorrect;

interface Worker {
    void atenderCliente();
    void organizarEstoque();
    void realizarEntrega(); // em uma empresa onde se tem vendedores e entregadores, o vendedor nao faz entrega entao nao faz sentido ter uma interface que faz "tudo"
}

class VendedorBalcaoViolacao implements Worker {
    @Override
    public void atenderCliente() { System.out.println("Atendendo cliente no balcão."); }

    @Override
    public void organizarEstoque() { System.out.println("Organizando prateleiras."); }

    @Override
    public void realizarEntrega() {
        // aqui, o vendedor de balcão é obrigado a ter esse método sem precisar
        throw new UnsupportedOperationException("Vendedor de balcão não faz entregas na rua.");
    }
}
