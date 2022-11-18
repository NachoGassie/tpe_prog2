package tpe;

import java.util.Iterator;

public class MiIterador <T> implements Iterator <T>{
    private Nodo <T> cursor; 

    public MiIterador(Nodo <T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return cursor != null;
    }

    @Override
    public T next() {
        T valor = (T) cursor.getValor();
        cursor = cursor.getSiguiente();
        return valor;
    }
}
