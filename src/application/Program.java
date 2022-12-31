package application;
import entities.Triangle;

import static java.lang.System.out;

import java.util.Locale;
import java.util.Scanner;
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       Triangle escaleno = new Triangle(sc.nextDouble());
       Triangle isoceles = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

       out.println(escaleno.area());
       out.println(isoceles.area());
        
        sc.close();
    }


}
