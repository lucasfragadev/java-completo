package EstruturaCondicional;

import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do primeiro número: ");
        Scanner sc = new Scanner(System.in);
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o valor do primeiro número: ");
        int segundoNumero = sc.nextInt();

        boolean encontrouMultiplo = false;

        for (int i = 0; i < 10; i++) {
            int resultado = primeiroNumero * i;

            if (resultado == segundoNumero) {
                System.out.println("Resultado = " + resultado);
                System.out.println("Os números são multiplos!");
                encontrouMultiplo = true;
                break;
            }
        }
        if (!encontrouMultiplo) {
            System.out.println("Nenhuma multiplicação de " + primeiroNumero + " até x 10 resultou em " + segundoNumero);
            System.out.println("Os números não são multiplos!");
        }

        sc.close();
    }
}