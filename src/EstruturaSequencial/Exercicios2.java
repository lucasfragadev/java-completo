package EstruturaSequencial;

import java.util.*;

public class Exercicios2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Double> listaRaios = Arrays.asList(2.00, 100.64, 150.00);
        for (int i = 0; i < listaRaios.size(); i++) { // Loop 'for' tradicional
            // uma variação seria usar o 'for each' da seguinte maneira:
            // for (double raio: listaRaios)
            // a iteração acontece sobre todos os elementos da lista
            // + fácil de ler e escrever, menos erros pois não precisa lidar com índices
            // OBS: + adequado para quando não há modificações na coleção durante a
            // iteração ou não precisar acessar os índices
            double raio = listaRaios.get(i);
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.printf("Área Círculo: %.4f%n", areaCirculo);
        }
    }
}