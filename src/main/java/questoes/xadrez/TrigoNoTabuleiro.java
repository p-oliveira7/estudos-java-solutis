package questoes.xadrez;

public class TrigoNoTabuleiro {
    public static void main(String[] args) {
        long soma = 0;
        long inicio = 1;
        int casaInt = 0;
        int casaLong = 0;

        for (int i = 1; i <= 64; i++) {
            inicio = inicio * 2;
            soma += inicio;

            if (casaInt == 0 && inicio > Integer.MAX_VALUE) {
                casaInt = i;
            }

            if (casaLong == 0 && inicio < 0) {
                casaLong = i;
            }
        }

        System.out.println("O monge esperava receber " + soma + " grãos de trigo.");

        if (casaInt > 0) {
            System.out.println("O overflow ocorrerá na casa " + casaInt + " para o tipo int.");
        } else {
            System.out.println("Não ocorrerá overflow para o tipo int com o tabuleiro de xadrez padrão.");
        }

        if (casaLong > 0) {
            System.out.println("O overflow ocorrerá na casa " + casaLong + " para o tipo long.");
        } else {
            System.out.println("Não ocorrerá overflow para o tipo long com o tabuleiro de xadrez padrão.");
        }
    }
}