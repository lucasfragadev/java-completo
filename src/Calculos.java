import java.util.Locale;

public class Calculos {
    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;
        Locale.setDefault(Locale.US);
        resultado = (double) a / b;

        System.out.printf("Resultado: %.2f%n ", resultado);
    }
}
