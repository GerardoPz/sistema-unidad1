package clasesAbs;

import java.util.Date;

public class A_Directivo extends Asociado{
	private String cargo;
	private Date fechaPosecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A_Directivo(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, String cargo, Date fechaPosecion) {
		super(numeroSocio, nombre, fechaIngreso,  numeroTelefono);
		// TODO Auto-generated constructor stub
		this.cargo=cargo;
		this.fechaPosecion=fechaPosecion;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setFechaPosecion(Date val) {
		fechaPosecion = val;
	}

	public String getCargo(){
		return cargo;
	}
	public Date getFechaPosecion() {
		return fechaPosecion;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + cargo + ", Fecha: " + fechaPosecion;
	}
}
