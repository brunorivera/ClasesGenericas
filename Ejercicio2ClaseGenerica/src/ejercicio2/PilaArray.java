package ejercicio2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    public E[] elementos;
    public int contador;

    @SuppressWarnings("unchecked")
    public PilaArray(int capacidad) {
        elementos = (E[]) new Object[capacidad];  // Java no permite new E[], por eso se hace así
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E e) {
        if (contador < elementos.length) {
            elementos[contador++] = e;
            return true;
        }
        return false;
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException("La pila está vacía");
        }
        return elementos[--contador];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila: [");
        for (int i = 0; i < contador; i++) {
            sb.append(elementos[i]);
            if (i < contador - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
