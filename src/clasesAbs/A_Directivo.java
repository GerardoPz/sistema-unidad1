package clasesAbs;

import java.util.Date;

public class A_Directivo extends Asociado{
	private String puesto;
	private String cargo;
	private String fechaPosecion;
	
	public A_Directivo() {
		super();
	}
	public A_Directivo(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, String tipoAsociado, String puesto, String cargo, String fechaPosecion) {
		super(numeroSocio, nombre, fechaIngreso,  numeroTelefono,  tipoAsociado);
		this.puesto=puesto;
		this.cargo=cargo;
		this.fechaPosecion=fechaPosecion;
	}

	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getFechaPosecion() {
		return fechaPosecion;
	}
	public void setFechaPosecion(String fechaPosecion) {
		this.fechaPosecion = fechaPosecion;
	}
}
