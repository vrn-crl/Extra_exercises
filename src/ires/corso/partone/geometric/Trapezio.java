package ires.corso.partone.geometric;

import java.util.Scanner;

public class Trapezio {
    public static double calc_area() {
            Scanner in = new Scanner(System.in);
            double [] lati = new double [3];
            System.out.println("Inserisci valore base maggiore");
            lati[0] = in.nextDouble();
            System.out.println("Inserisci valore base minore");
            lati[1] = in.nextDouble();
            System.out.println("Inserisci valore altezza");
            lati[2] = in.nextDouble();

            double areaTr = ((lati[0]+lati[1])*lati[2])/2;
            return areaTr;
    }
}
