public class Exercicios6 {
    public static void main(String[] args) {
        double A = 3.0;
        double B = 4.0;
        double C = 5.2;
        double areaTrianguloRetangulo = (A * C) / 2;
        double areaCirculo  = Math.PI * C * C;
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        System.out.println("Area triangulo retangulo: " + areaTrianguloRetangulo);
        System.out.println("Area Circulo: " + areaCirculo);
        System.out.println("Area Trapezio: " + areaTrapezio);
        System.out.println("Area Quadrado: " + areaQuadrado);
        System.out.println("Area Retangulo: " + areaRetangulo);
    }
}