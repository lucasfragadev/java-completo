package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorCachorroQuente = 4.00;
        double valorXisSalada = 4.50;
        double valorXisBacon = 5.00;
        double valorTorradaSimples = 2.00;
        double valorRefrigerante = 1.50;

        int quantidadeItem;
        int escolha;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual item você deseja: \n1. Cachorro Quente\n2. X-Salada \n3. X-Bacon \n4. Torrada simples \n5. Refrigerante");
        escolha = sc.nextInt();
        if (escolha == 1) {
            System.out.println("Quantos Cachorros-quente você quer? ");
            quantidadeItem = sc.nextInt();
            total = valorCachorroQuente * quantidadeItem;
            System.out.printf("Total R$: %.2f%n", total);
        } else if (escolha == 2) {
            System.out.println("Quantos X-Salada você quer? ");
            quantidadeItem = sc.nextInt();
            total = valorXisSalada * quantidadeItem;
            System.out.printf("Total R$: %.2f%n", total);
        } else if (escolha == 3) {
            System.out.println("Quantos X-Bacon você quer? ");
            quantidadeItem = sc.nextInt();
            total = valorXisBacon * quantidadeItem;
            System.out.printf("Total R$: %.2f%n", total);
        } else if (escolha == 4) {
            System.out.println("Quantas Torradas Simples você quer? ");
            quantidadeItem = sc.nextInt();
            total = valorTorradaSimples * quantidadeItem;
            System.out.printf("Total R$: %.2f%n", total);
        } else if (escolha == 5) {
            System.out.println("Quantos Refrigerantes você quer? ");
            quantidadeItem = sc.nextInt();
            total = valorRefrigerante * quantidadeItem;
            System.out.printf("Total R$: %.2f%n", total);
        }

        sc.close();

    }
}