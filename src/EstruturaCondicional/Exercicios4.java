package EstruturaCondicional;

import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        System.out.println("Digite a hora inicial: ");
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        int horasDia = 24;
        int quantidadeHoras;

        if (horaInicial > horaFinal) {
            quantidadeHoras = horasDia - horaInicial + horaFinal;
        } else if (horaInicial < horaFinal) {
            quantidadeHoras = horaFinal - horaInicial;
        } else {
            quantidadeHoras = horasDia;
        }

        System.out.println("O JOGO DUROU " + quantidadeHoras + " hora(s)");

        sc.close();

    }
}