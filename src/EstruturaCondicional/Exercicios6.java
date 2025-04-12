package EstruturaCondicional;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorTestado;
        System.out.println("Digite qualquer valor: ");
        Scanner sc = new Scanner(System.in);
        valorTestado = sc.nextDouble();
        if (valorTestado > 0 && valorTestado <= 25) {
            System.out.println("Intervalo (0, 25)");
        } else if (valorTestado > 25 && valorTestado <= 50) {
            System.out.println("Intervalo (25, 50)");
        } else if (valorTestado > 50 && valorTestado <= 75) {
            System.out.println("Intervalo (50, 75)");
        } else if (valorTestado > 75 && valorTestado <= 100) {
            System.out.println("Intervalo (75, 100)");
        } else {
            System.out.println("Fora do Intervalo");
        }

        sc.close();

    }
}