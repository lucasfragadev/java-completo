import java.util.Arrays;
import java.util.List;

public class Exercicios3 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(5, 6, 7, 8);
        int diferencaNumeros = (listaNumeros.get(0) * listaNumeros.get(1)) - listaNumeros.get(2) * listaNumeros.get(3);
        System.out.println(diferencaNumeros);
    }
}