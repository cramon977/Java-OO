package entities;

public class Triangle {
    public double ladoA, ladoB, ladoC;
    public Triangle(){

    };

    public Triangle(double lado){
        this.ladoA = lado;
        this.ladoB = lado;
        this.ladoC = lado;
    }
    public Triangle(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
//    @Override
//    public  String toString () {
//        return String.format("a: %.%2f, b: %.2, c: %.2f ", this.ladoA, this.ladoB, this.ladoC);
//    }

    public double area() {

        double perimetro = this.ladoA + this.ladoB + this.ladoC;
        return Math.sqrt(perimetro*(perimetro-this.ladoA)*
                (perimetro-this.ladoB)*(perimetro-this.ladoC));


    }


}
