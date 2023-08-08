package questoes.banco;

public class ProgramaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.numero = "123456";
        cc.tipo = "corrente";
        cc.primeiroTitular = new Cliente();
        cc.primeiroTitular.nome = "João";
        cc.segundoTitular = new Cliente();
        cc.segundoTitular.nome = "Maria";
        cc.saldo = 1000.0;
        cc.limiteTotal = 500.0;

        cc.credito(200.0);
        cc.debito(300.0);
        cc.resumo();
    }
}