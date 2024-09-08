package clasesAbs;

import java.util.Date;

public class Asociado {
    private int numeroSocio;
    private String nombre;
    private Date fechaIngreso;
    private int numeroTelefono;

    public Asociado() {

    }

    public Asociado(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.numeroTelefono = numeroTelefono;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "numeroSocio=" + numeroSocio +
                ", nombre='" + nombre + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
