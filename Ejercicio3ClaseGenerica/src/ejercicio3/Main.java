package ejercicio3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarProducto(new Alimento("Pan", 1.5));
        almacen.agregarProducto(new Electronico("Televisor", 1500));
        almacen.agregarProducto(new Alimento("Leche", 0.99));
        almacen.agregarProducto(new Electronico("Notebook", 2200));

        System.out.println("Productos en el almacén:");
        Almacen.imprimirProductos(almacen.productos);
    }
}
