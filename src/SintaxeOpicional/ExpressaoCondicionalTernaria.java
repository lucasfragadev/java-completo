package SintaxeOpicional;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int numero = sc.nextInt();
        System.out.println((numero % 2 == 0) ? "Número Par" : "Número Ímpar");

        sc.close();
    }
}
