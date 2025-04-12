package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorX;
        double valorY;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do X: ");
        valorX = sc.nextDouble();
        System.out.println("Digite o valor do Y: ");
        valorY = sc.nextDouble();

        if (valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }
        sc.close();
    }
}