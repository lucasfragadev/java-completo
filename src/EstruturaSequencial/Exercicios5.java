package EstruturaSequencial;

import java.util.Locale;

public class Exercicios5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int codigoPeca1 = 12;
        int codigoPeca2 = 16;
        int numeroPeca1 = 1;
        int numeroPeca2 = 2;
        double valorPeca1 = 5.30;
        double valorPeca2 = 5.10;
        double totalPeca1 = numeroPeca1 * valorPeca1;
        double totalPeca2 = numeroPeca2 * valorPeca2;
        double totalPecas = totalPeca1 + totalPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", totalPecas);
    }
}