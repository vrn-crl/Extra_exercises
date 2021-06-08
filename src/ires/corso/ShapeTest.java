package ires.corso;

//import ires.corso.partone.geometric.Quadrato;

import ires.corso.partone.geometric.Quadrato;
import ires.corso.partone.geometric.Trapezio;
import ires.corso.partone.geometric.Triangolo;

import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        System.out.println("Quale area desideri calcolare fra Triangolo, Trapezio e Quadrato?");
        Scanner in = new Scanner(System.in);
        String shape = in.nextLine();
        switch (shape) {
            case "Quadrato":
                System.out.println(Quadrato.calc_area());
            break;
            case "Triangolo":
                System.out.println(Triangolo.calc_area());
            break;
            case "Trapezio":
                System.out.println(Trapezio.calc_area());
            break;
        }
    }
}
