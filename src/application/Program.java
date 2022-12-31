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










        //

        //areaTrianguloX = Math.sqrt(perimetro*(perimetro-ladoA)*(perimetro-ladoB)*(perimetro-ladoC));


        //out.printf("Area de tringuloX: %.2f", areaTrianguloX);




        sc.close();
    }


}
