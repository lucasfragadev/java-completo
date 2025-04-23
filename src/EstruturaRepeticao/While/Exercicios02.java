package EstruturaRepeticao.While;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios02 {
    public static void  main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorX;
        double valorY;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor X: ");
        valorX = sc.nextDouble();
        System.out.println("Digite o valor Y: ");
        valorY = sc.nextDouble();

        while (valorX != 0 && valorY != 0) {
            if (valorX > 0 && valorY > 0) {
                System.out.println("Q1");
            } else if (valorX < 0 && valorY > 0) {
                System.out.println("Q2");
            } else if (valorX < 0 && valorY < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }

            System.out.println("Digite o valor X: ");
            valorX = sc.nextDouble();
            System.out.println("Digite o valor Y: ");
            valorY = sc.nextDouble();
        }
        sc.close();
   }
}