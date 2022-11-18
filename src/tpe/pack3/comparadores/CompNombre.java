package tpe.pack3.comparadores;

import java.util.Comparator;

import tpe.pack3.Alumno;

public class CompNombre implements Comparator <Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
