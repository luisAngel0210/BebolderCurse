package co.com.bebolder.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//claseLibro
public class Libro {

    private String nombre;
    private String autor;
    private int puntaje;

    public Libro(String nombre, String autor, int puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }
}
