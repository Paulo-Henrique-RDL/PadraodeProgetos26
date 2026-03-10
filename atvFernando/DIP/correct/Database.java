package DIP.correct;

public interface Database {
    void salvar(double valor); // aqui, criamos uma abstração (interface) que define o contrato para qualquer tipo de banco de dados, invertendo a dependência
}

