package clasesAbs;

import java.util.Date;

public class Asociado {
    private static int contadosSocios = 0;
    private int numeroSocio;
    private String nombre;
    private Date fechaIngreso;
    private String numeroTelefono;

    public Asociado() {

    }

    public Asociado(String nombre, Date fechaIngreso, String numeroTelefono) {
        contadosSocios ++;
        this.numeroSocio = contadosSocios;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio() {
        contadosSocios ++;
        this.numeroSocio = contadosSocios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Asociado: "+"Numero De Socio=" + numeroSocio + ", nombre = " + nombre + '\'' + ", fechaIngreso = " + fechaIngreso + ", numeroTelefono = " + numeroTelefono;
    }
}
