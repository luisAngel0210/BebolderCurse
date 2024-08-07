package co.com.bebolder;

public class Calculadora {
    private int acumulado;

    public Calculadora(int inicial) {
        this.acumulado = inicial;
    }

    public Calculadora sumar(int valor) {
        acumulado += valor;
        System.out.println("Suma: " + acumulado);
        return this;
    }

    public Calculadora restar(int valor) {
        acumulado -= valor;
        System.out.println("Resta: " + acumulado);
        return this;
    }

    public Calculadora multiplicar(int valor) {
        acumulado *= valor;
        System.out.println("Multiplicación: " + acumulado);
        return this;
    }

    public static void main(String[] args) {
        new Calculadora(10)
                .sumar(5)
                .restar(3)
                .multiplicar(2);
    }
}
