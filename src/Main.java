import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product1 = "Apple";
        String product2 = "Office Desk";
        int ageLucas = 34;
        int code = 5290;
        char gender = 'M';
        double price1 = 2100.0;
        double price2 = 650.00;
        double measure = 53.24567;
        System.out.println("Produtos: ");
        System.out.println(product1 + ", com o preço de R$ " +  price1);
        System.out.println(product2 + ", com o preço de R$ " + price2);
        System.out.println("Usuário: " + ageLucas + " anos de idade, ID de nª " + code + ", e sexo " + gender);
        System.out.println("Número comum: " + measure);
        System.out.printf("Número arredondado: %.2f%n ", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Numéro em formato US: " + measure);

    }

}