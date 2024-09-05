package clasesAbs;

import java.util.Date;

public class A_Directivo extends Asociado{
	private String puesto;
	private String cargo;
	private String fechaPosecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A_Directivo(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, String tipoAsociado, String puesto, String cargo, String fechaPosecion) {
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
	
	public void setFechaPosecion(String fechaPosecion) {
		fechaPosecion = fechaPosecion;
	}
}
