import java.lang.Math;
import java.util.*;

public class Gravitacija{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("OIS je zakon!");

        double v = sc.nextDouble();

        System.out.println(izracunajG(v));

    }

    public static double izracunajG (double v) {

        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double a = (C * M) / ((r + v) * (r + v));

        return a;

    }

}
