package clasesAbs;

import java.util.Date;

public class A_Directivo extends Asociado{
	private String puesto;
	private String cargo;
	private Date fechaPosecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A_Directivo(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, String tipoAsociado, String puesto, String cargo, Date fechaPosecion) {
		super(numeroSocio, nombre, fechaIngreso,  numeroTelefono,  tipoAsociado);
		// TODO Auto-generated constructor stub
		this.puesto=puesto;
		this.cargo=cargo;
		this.fechaPosecion=fechaPosecion;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setFechaPosecion(Date fechaPosecion) {
		fechaPosecion = fechaPosecion;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getCargo(){
		return cargo;
	}
	public Date getFechaPosecion() {
		return fechaPosecion;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + cargo + ", Fecha de Toma de Posesión: " + fechaPosecion;
	}
}
