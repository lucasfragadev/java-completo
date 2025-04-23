package EstruturaRepeticao.For;

import java.util.Scanner;

public class Notes01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nQuantos números você vai somar? ");
        int n =  sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            int numeroDigitado = sc.nextInt();
            soma += numeroDigitado;
        }

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
