package co.com.bebolder;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FiltrarNombres {

/*Usa Optional Streams, ForEeach y Filter para:
a) Crear una lista que contenga una lista de nombres.
b) Crear un método o una función que, recibiendo un parámetro, recorra la lista creada en el paso anterior
 y devuelva otra lista con los elementos que coincidan exactamente con el parámetro recibido.
c) Usando Optional, crear una función o un método que imprima los elementos de la nueva lista filtrada en el punto anterior.
 */

    public static void main(String[] args) { 
        List<String> nombres = Arrays.asList("Valen", "Luis", "Alex", "Valen");
        Function<String, List<String>> filtrarPorNombre = nombreBuscado -> nombres.stream().filter(nombre -> nombre.equals(nombreBuscado)).collect(Collectors.toList());
        List<String> resultado = filtrarPorNombre.apply("Valen");
        Optional.of(resultado).ifPresent(lista -> lista.forEach(nombre -> System.out.println("Nombre encontrado: " + nombre)));
    }
}
