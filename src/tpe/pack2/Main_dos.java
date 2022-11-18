package tpe.pack2;

import java.util.Comparator;

import tpe.Lista;
import tpe.pack3.comparadores.CompInverso;

public class Main_dos {
    public static void main(String[] args) {
        Comparator <String> compString = new CompString();

        Lista <String> list = new Lista<>(compString);

        list.addOrdenado("facil");
        list.addOrdenado("es");
        list.addOrdenado("parcial");
        list.addOrdenado("prog2");

        for (String str: list) {
            System.out.println(str);
        }

        System.out.println("\n" + list.obtenerPos("parcial"));
        System.out.println("\n" +list.obtenerPos("recuperatorio"));

        list.setC(new CompInverso<>(compString));

        System.out.println("");
        
        for (String str: list) {
            System.out.println(str);
        }
    }    
}
