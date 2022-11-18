package tpe.pack3;

import java.util.ArrayList;

public class Alumno extends Elem{
    private String apellido;
    private int edad;
    private int dni;
    private ArrayList <String> palabrasClave;

    public Alumno(String nombre, String apellido, int edad, int dni) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        palabrasClave = new ArrayList<>();
    }

    @Override
    public int getCantAlum(){
        return 1;
    }


    public void addPc(String p){
        if (!palabrasClave.contains(p)) {
            palabrasClave.add(p);
        }
    }
    public ArrayList <String> getPc(){
        return new ArrayList<>(palabrasClave);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public int getDni() {
        return dni;
    }

    public boolean equals(Object o1){
        try {
            Alumno otro = ((Alumno) o1);

            return this.edad == otro.getEdad();
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
    }    
}
