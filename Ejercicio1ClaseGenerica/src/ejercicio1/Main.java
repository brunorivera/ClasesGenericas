package ejercicio1;

public class Main {
    public static void main(String[] args) {
        NumeroEntero a = new NumeroEntero(10);
        NumeroEntero b = new NumeroEntero(5);

        System.out.println("Suma: " + a.sumar(b));
        System.out.println("Resta: " + a.restar(b));
        System.out.println("Producto: " + a.producto(b));
        System.out.println("División: " + a.dividir(b));
    }
}
