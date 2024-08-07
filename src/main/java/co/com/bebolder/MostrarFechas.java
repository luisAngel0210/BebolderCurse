package co.com.bebolder;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

public class MostrarFechas {
    /*7. Dada una lista de fechas, crea un método usando un operador de referencia (Operator :: )
    que permita mostrar el siguiente mensaje por consola "La fecha es <día> de <mes> del <año>.
     */
    public static void main(String[] args) { 
        List<LocalDate> fechas = List.of(
                LocalDate.of(2024, 8, 7), 
                LocalDate.of(2023, 1, 15),
                LocalDate.of(2025, 9, 15)
        );
        Function<LocalDate, String> formatearFecha = MostrarFechas::formatearFecha; 
        fechas.forEach(fecha -> System.out.println(formatearFecha.apply(fecha)));
    }
    public static String formatearFecha(LocalDate fecha) {
        return String.format("La fecha es %d de %d del %d", fecha.getDayOfMonth(), fecha.getMonthValue(), fecha.getYear()); 
    }
}