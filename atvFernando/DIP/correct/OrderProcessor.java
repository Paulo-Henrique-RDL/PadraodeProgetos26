package DIP.correct;

public class OrderProcessor {
    private Database database; // agora, a classe de alto nível depende de uma abstração (interface), não mais de uma implementação concreta

    public OrderProcessor(Database database) {
        this.database = database; // a dependência é injetada via construtor (Dependency Injection), seguindo o princípio DIP
    }

    public void processarPedido(double valor) {
        // lógica de processamento do pedido
        System.out.println("Processando pedido no valor de: " + valor);
        database.salvar(valor);
    }
}

