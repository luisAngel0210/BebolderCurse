package co.com.bebolder;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class DivisionBigDecimal {
//5. Usando BinaryOperator, dados dos BigDecimal, retorna un BigDecimal con el resultado de una división.
    public static void main(String[] args){
        BinaryOperator<BigDecimal> dividir = (a,b) -> a.divide(b, 2, RoundingMode.HALF_UP);
        BigDecimal a = new BigDecimal("20");
        BigDecimal b = new BigDecimal("3");

        BigDecimal resutado = dividir.apply(a, b);
        System.out.println("El resultado de la division es: " + resutado);
    }
}

