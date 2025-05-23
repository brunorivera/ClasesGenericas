package ejercicio1;

public interface Operable<E> {
    E sumar(E otro);
    E restar(E otro);
    E producto(E otro);
    E dividir(E otro);
}
