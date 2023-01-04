package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import static java.lang.System.out;
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        out.println("Enter product data: ");
        out.print("Name: ");
        product.setName(sc.nextLine());
        out.print("Price:");
        product.setPrice(sc.nextDouble());

        out.println("Produto Cadastrado:");

        out.println("In stock: "+ product);

        out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        out.println("Update data: " + product);

        out.print("Enter the number of product to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        out.println("Update data: "+ product);

        sc.close();
    }
}
