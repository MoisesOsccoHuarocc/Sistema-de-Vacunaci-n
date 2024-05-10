
package Negocio;

import Datos.Lectura;
import java.util.Calendar;
import java.util.Date;

public class Logica {
    Lectura dni =new Lectura();
    
    public boolean validarExistencia(int numeroDocumento, String fechaNacimiento, String fechaEmision){
        if(dni.leerUnDato(numeroDocumento)==null){
            System.out.println("1111");
            return false;
        }
        if(fechaNacimiento.equals(dni.leerUnDato(numeroDocumento).getFechaNacimiento().toString())){
            System.out.println("2222");
            return false;
        }
        if(fechaEmision.equals(dni.leerUnDato(numeroDocumento).getEmisionDni().toString())){
            System.out.println("3333");
            return false;
        }
        return true;
    }
    public String obtenerNombre(int numeroDocumento){
        
        return dni.leerUnDato(numeroDocumento).getNombre();
    }
    public int obtenerNumeroDosis(int numeroDocumento){
        return dni.leerNumeroDosis(numeroDocumento).getNumeroDosis();
    }
    public int obtenerEdad(int numeroDocumento){
        Calendar fechaNacimientoCal = Calendar.getInstance();
    fechaNacimientoCal.setTime(dni.leerUnDato(numeroDocumento).getFechaNacimiento());
    
    Calendar fechaActual = Calendar.getInstance();
    
    int años = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
    
    // Si la fecha actual es antes que la fecha de nacimiento, resta un año
    if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimientoCal.get(Calendar.DAY_OF_YEAR)) {
        años--;
    }
    
    return años;
    }
}
