package EstruturaRepeticao.While;

import java.util.Scanner;

public class Exercicios03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoDeCombustivel;
        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        System.out.println("Qual o tipo de combustível: \n1. Álcool\n2. Gasolina \n3. Diesel \n4. Sair");
        tipoDeCombustivel = sc.nextInt();

        while (tipoDeCombustivel != 4) {
            if (tipoDeCombustivel == 1) {
                quantidadeAlcool += 1;
                System.out.println("Abasteceu com álcool");
            } else if (tipoDeCombustivel == 2) {
                quantidadeGasolina += 1;
                System.out.println("Abasteceu com gasolina");
            } else if (tipoDeCombustivel == 3) {
                quantidadeDiesel += 1;
                System.out.println("Abasteceu com diesel");
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }

            System.out.println("\nQual o tipo de combustível: \n1. Álcool\n2. Gasolina \n3. Diesel \n4. Sair");
            tipoDeCombustivel = sc.nextInt();
        }

        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Álcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);

        sc.close();
    }
}