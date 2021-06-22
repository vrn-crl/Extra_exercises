package ires.corso.parttwo.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class MyArrayList_01 {

    public static void main (String[] args){
        //Write a Java program to create a new array list, add some colors (string) and print out the collection.
        ArrayList <String> colors = new ArrayList<String>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Pink");
        //System.out.println(colors);

        //Write a Java program to iterate through all elements in a array list
        for (String i: colors) { //per ogni oggetto stringa i in colors stampa
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------------");

        //Write a Java program to insert an element into the array list at the first position
        colors.add(0,"Elemento");
        for (String elem : colors){
            System.out.println(elem);
        }

        System.out.println("-----------------------------------------------------------");

        //Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(colors.get(0)); // get è ilmetodo per restituire valore dell elemento nell n posizione
        System.out.println("-----------------------------------------------------------");

        //Write a Java program to update specific array element by given element
        colors.set(0, "Orange");
        System.out.println(colors);
        System.out.println("------------------------------------------------------------");

        //Write a Java program to remove the third element from a array list
        colors.remove(2);
        System.out.println(colors);// rimosso green
        System.out.println("-------------------------------------------------------------");

        //Write a Java program to search an element in a array list
        System.out.println(colors.indexOf("Blue"));
        System.out.println("-------------------------------------------------------------");

        //Write a Java program to sort a given array list
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(58);
        Collections.sort(numbers);//This class consists exclusively of static methods that operate on or return collections.
        Collections.sort(colors);
        System.out.println(numbers); //ordina numeri in modo crescente
        System.out.println(colors); //ordina parole in ordine alfabetico
        System.out.println("--------------------------------------------------------------");

        //Write a Java program to copy one array list into another.
        ArrayList <String> colors2 = new ArrayList<String>();
        colors2.add("Black");
        colors2.add("Grey");
        colors2.add("Yellow");

        System.out.println("Array list colors2 before copy" + colors2);
        Collections.copy(colors2, colors);
        System.out.println("Array list colors2 after copy" + colors2);
        System.out.println("---------------------------------------------------------------");

        //Write a Java program to shuffle elements in a array list
        Collections.shuffle(numbers);
        System.out.println(numbers);





    }
}


