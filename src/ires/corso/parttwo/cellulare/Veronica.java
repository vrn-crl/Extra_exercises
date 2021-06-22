package ires.corso.parttwo.cellulare;

public class Veronica {
    public static void main (String[] args){
        Cellulare celVeronica = new Cellulare(10.0,0);
        celVeronica.ricarica(5.0);
        System.out.println(celVeronica.numero404());
        celVeronica.chiama(5);
        System.out.println(celVeronica.numero404());
    }
}
