import java.util.Date;

public class Asociado {
    private int numeroSocio;
    private String nombre;
    private Date fechaIngreso;
    private int numeroTelefono;
    String tipoAsociado;

    public Asociado(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, String tipoAsociado) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.numeroTelefono = numeroTelefono;
        this.tipoAsociado = tipoAsociado;
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

    public String getTipoAsociado() {
        return tipoAsociado;
    }

    public void setTipoAsociado(String tipoAsociado) {
        this.tipoAsociado = tipoAsociado;
    }
}
