package co.com.bebolder;

import co.com.bebolder.model.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class CrearListaLibros {
    /*
4. Actividad Mis Libros:
a) Crea una clase llamada "libros", que contenga nombre, autor, puntaje.
b) Usa un supplier para crear una lista de libros. (Más de 3, por lo menos).
c) Crea un consumer que reciba una lista de libros para hacer lo siguiente:
- Crea un predicate que determine si los libros son recomendados cuando el libro tiene un puntaje mayor o igual a 7.
- Usando UnaryOperator, muestra por consola el mensaje "El libro <tal libro> es recomendado smile".
*/
   public static void main(String[] args) {
       Supplier<List<Libro>> proveedorLibros = () -> {
        List<Libro> Listalibros = new ArrayList<>();
           Listalibros.add(new Libro("Libro 1", "Autor 1", 8));
           Listalibros.add(new Libro("Libro 2", "Autor 2", 6));
           Listalibros.add(new Libro("Libro 3", "Autor 3", 9));
           Listalibros.add(new Libro("Libro 4", "Autor 4", 7));
        return Listalibros;
       };
       Predicate<Libro> esRecomendado = libro -> libro.getPuntaje() >= 7;
       UnaryOperator<String> mensajeRecomendado = libro -> "El libro " + libro + " es recomendado :)";

       Consumer<List<Libro>> procesarLibros = libros -> libros.stream()
               .filter(esRecomendado)
               .map(Libro::getNombre)
               .map(mensajeRecomendado)
               .forEach(System.out::println);
       procesarLibros.accept(proveedorLibros.get());
   }
}