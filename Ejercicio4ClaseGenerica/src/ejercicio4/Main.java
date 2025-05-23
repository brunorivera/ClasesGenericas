package ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregarElemento(new Alimento("Queso", 3.0));
        almacen.agregarElemento(new Electronico("Celular", 800));

        System.out.println("Elementos en el almacén:");
        Almacen.imprimirElementos(almacen.elementos);
    }
}
