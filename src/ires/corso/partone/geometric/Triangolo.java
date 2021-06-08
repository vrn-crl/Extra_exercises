package ires.corso.partone.geometric;

import java.util.Scanner;

public class Triangolo {
    public static double calc_area() {
        Scanner in = new Scanner(System.in);
        double[] lati = new double[2];
        System.out.println("Inserisci base Triangolo");
        lati[0] = in.nextDouble();
        System.out.println("Inserisci altezza Triangolo");
        lati[1] = in.nextDouble();
        double areaT = (lati[0] * lati[1])/2;
        return areaT;
    }
}
