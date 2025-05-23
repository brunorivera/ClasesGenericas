package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    public List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public static <T> void imprimirElementos(List<? super T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
