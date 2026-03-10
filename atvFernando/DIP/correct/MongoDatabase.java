package DIP.correct;

public class MongoDatabase implements Database {
    @Override
    public void salvar(double valor) {
        System.out.println("Salvando pedido no banco MongoDB...");
    }
}

