package tpe.pack3.comparadores;

import tpe.pack3.Alumno;

public class CompAlumEdad extends CompCompuesto{

    @Override
    public int comparar(Alumno o1, Alumno o2) {
        return o1.getEdad() - o2.getEdad();
    }
    
}
