package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    public List<T> productos = new ArrayList<>();

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public static void imprimirProductos(List<? extends Producto> lista) {
        for (Producto p : lista) {
            System.out.println(p);
        }
    }
}
