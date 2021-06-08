package ires.corso.partone.geometric;

import java.util.Scanner;

public class Quadrato{
    public static double calc_area (){
            Scanner in = new Scanner(System.in);
            System.out.println("Inserisci lato quadrato");
            double l = in.nextDouble();
            double areaQ = l * l;
            return areaQ;
    }
}
