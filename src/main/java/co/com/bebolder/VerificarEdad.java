package co.com.bebolder;

import java.time.LocalDate;
import java.util.function.BiFunction;

public class VerificarEdad { 
    /*6. Usando una interface SAM, crea una función que reciba el nombre,
     la edad de una persona y la fecha de nacimiento, y devuelva el siguiente mensaje:
     "La fecha de nacimiento de <nombre> corresponde/no corresponde a la edad ingresada".
     */
    @FunctionalInterface
    interface VerificadorEdad {
        String verificar(String nombre, int edad, LocalDate fechaNacimiento); 
    }
    public static void main(String[] args) { 
        BiFunction<Integer, LocalDate, Integer> calcularEdad = (anoActual, fechaNacimiento) -> anoActual - fechaNacimiento.getYear();
        VerificadorEdad verificador = (nombre, edad, fechaNacimiento) -> { 
            int edadCalculada = calcularEdad.apply(LocalDate.now().getYear(), fechaNacimiento); 
            return "La fecha de nacimiento de " + nombre + (edad == edadCalculada ? " corresponde" : " no corresponde") + " a la edad ingresada.";
        }; 
        String mensaje = verificador.verificar("Luis", 30, LocalDate.of(1994, 8, 7));
        String mensajeOther = verificador.verificar("Alex", 15, LocalDate.of(2000, 8, 7));
        System.out.println(mensaje);
        System.out.println(mensajeOther);
    }
}