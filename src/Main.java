/*Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Student> registro = new ArrayList<>();
        registro.add(new Student("Fabrizio", 26));
        registro.add(new Student("Nicola", 30));
        registro.add(new Student("Patrizia", 29));
        registro.add(new Student("Alberto", 29));
        registro.add(new Student("Alessandro", 27));
        registro.add(new Student("Valeria", 28));
        registro.add(new Student("Angela", 31));
        registro.add(new Student("Chiara", 20));
        registro.add(new Student("Tamara", 21));
        registro.add(new Student("Angelo", 23));
        registro.add(new Student("Mercuzio", 26));
        registro.add(new Student("Ambrogio", 55));
        System.out.println(registro);
        registro.sort(Comparator.comparing(Student :: getName));
        System.out.println(registro);
    }
}
