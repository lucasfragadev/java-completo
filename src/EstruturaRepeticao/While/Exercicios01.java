package EstruturaRepeticao.While;

import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite sua senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("\nSenha Inválida");
            System.out.println("\nDigite sua senha: ");
            senha = sc.nextInt();

            if (senha == 2002) {
                System.out.println("\nSenha Correta");
                System.out.println("\nAcesso Permitido");
                break;
            }
        }
    }
}