package EstruturaCondicional;

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner parOuImpar = new Scanner(System.in);
        System.out.println("Digite qualquer valor: ");
        int valor = parOuImpar.nextInt();
        if (valor == 0) {
            System.out.println("Você digitou 0.");
        } else {
            if (valor % 2 == 0) {
                System.out.println("O número é par!");
            } else {
                System.out.println("O número é ímpar!");
            }
        }
        parOuImpar.close();
    }
}