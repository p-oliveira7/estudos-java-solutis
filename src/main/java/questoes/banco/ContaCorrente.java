package questoes.banco;

public class ContaCorrente {
    String numero;
    String tipo;
    Cliente primeiroTitular;
    Cliente segundoTitular;
    double saldo;
    double limiteTotal;

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public void resumo() {
        System.out.println("Numero da Conta Corrente: " + numero);
        System.out.println("Nome do primeiro titular: " + primeiroTitular.nome);
        if (segundoTitular != null) {
            System.out.println("Nome do segundo titular: " + segundoTitular.nome);
        }
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Limite Atual: " + (limiteTotal + saldo));
        System.out.println("Limite Total: " + limiteTotal);
        if (estaDevedor()) {
            System.out.println("Procure o seu gerente!");
        }
    }

    public boolean estaDevedor() {
        return saldo < 0;
    }
}


