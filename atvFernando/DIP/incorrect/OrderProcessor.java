package DIP.incorrect;

class OrderProcessor {
    private MySQLDatabase database; // aqui começa o erro, a classe de alto nível (OrderProcessor) depende diretamente da classe de baixo nível (MySQLDatabase), violando o princípio DIP

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }

    public void processarPedido(double valor) {
        // lógica de processamento do pedido
        System.out.println("Processando pedido no valor de: " + valor);
        database.salvar(valor);
    }
}

class MySQLDatabase {
    public void salvar(double valor) {
        System.out.println("Salvando pedido no banco MySQL...");
    }
}

