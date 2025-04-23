package EstruturaCondicional;

import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer valor: ");
        int valor = sc.nextInt();
        if (valor > 0) {
            System.out.println("O número é positivo");
        } else if (valor < 0) {
            System.out.println(("O número é negativo"));
        } else {
            System.out.println("Você digitou 0");
        }

        sc.close();
    }
}