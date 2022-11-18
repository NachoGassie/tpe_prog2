package tpe.pack1;

import tpe.Lista;

public class Main_uno {
    public static void main(String[] args) {
        Lista <Integer> list = new Lista<>(new CompInt());
        list.addOrdenado(10);
        list.addOrdenado(21);
        list.addOrdenado(1);
        list.addOrdenado(5);
        list.addOrdenado(11);

        for (Integer i : list) {
            System.out.println(i);
        }

        list.eliminarPos(0);
        list.eliminarOcurrencia(5);
        list.eliminarOcurrencia(11);

        System.out.println("");
        System.out.println("");
        
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
