package ejercicio1;

public class NumeroEntero implements Operable<NumeroEntero> {
    public int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    @Override
    public NumeroEntero sumar(NumeroEntero otro) {
        return new NumeroEntero(this.valor + otro.valor);
    }

    @Override
    public NumeroEntero restar(NumeroEntero otro) {
        return new NumeroEntero(this.valor - otro.valor);
    }

    @Override
    public NumeroEntero producto(NumeroEntero otro) {
        return new NumeroEntero(this.valor * otro.valor);
    }

    @Override
    public NumeroEntero dividir(NumeroEntero otro) {
        if (otro.valor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return new NumeroEntero(this.valor / otro.valor);
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}
