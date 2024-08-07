package co.com.bebolder.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//claseMutable
public class PersonaMutable {
    private String nombre;
    private String apellido;
    private int edad;

    public PersonaMutable(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
