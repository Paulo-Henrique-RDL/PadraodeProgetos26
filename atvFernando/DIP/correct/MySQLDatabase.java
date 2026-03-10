package DIP.correct;

public class MySQLDatabase implements Database {
    @Override
    public void salvar(double valor) {
        System.out.println("Salvando pedido no banco MySQL...");
    }
}

