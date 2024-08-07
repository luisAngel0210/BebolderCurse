package co.com.bebolder;

import java.util.function.Function;
import java.util.function.Predicate;


public class Potencia {
    public static void main(String[] args) {
      //Crea un algoritmo que devuelva la potencia de un número dado, usando la clase function.
       Function<Integer, Integer> potencia = x -> x * x;
       int numero = 3;
       int resultadoPotencia = potencia.apply(numero);
       System.out.println("La potencia de " + numero + " es: " + resultadoPotencia);
       //De acuerdo con el punto anterior, valida si la respuesta del resultado es par o impar (Predicate).
      Predicate<Integer> esPar = x -> x % 2 == 0;
      if (esPar.test(resultadoPotencia)){
       System.out.println("El resultado  numerico de la Potencia " + resultadoPotencia + " es par");
      } else {
       System.out.println("El resultado numerico de la Potencia " + resultadoPotencia + " es Impar");
      }

    }
}

