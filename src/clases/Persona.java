package clases;

/**
 *
 * @author baltamar3
 */
public class Persona {

    private long identidad;
    private String primer_nombre;
    private String primer_apellido;

    public Persona(long identidad, String primer_nombre, String primer_apellido) {
        this.identidad = identidad;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
    }

    public long getIdentificacion() {
        return identidad;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }
    public void setPrimer_nombre(String primer_nombre){
        this.primer_nombre=primer_nombre;
    }

    public void setIdentidad(long identidad) {
        this.identidad = identidad;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

}
