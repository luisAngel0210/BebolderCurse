package co.com.bebolder.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//claseImnutable
public class PersonaInmutable {

    private final String nombre;
    private final String apellido;
    private final int edad;

    public PersonaInmutable(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
