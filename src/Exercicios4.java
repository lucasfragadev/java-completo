import java.util.Locale;

public class Exercicios4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numeroFuncionario = 25;
        double horasTrabalhadas = 100.00;
        double valorPorHora = 5.50;
        double salario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = %.2f", salario);
    }
}
