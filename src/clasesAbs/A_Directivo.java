package clasesAbs;

import java.util.Date;

public class A_Directivo extends Asociado{
	private static int contadosSocios = 0;
	private String cargo;
	private Date fechaPosecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A_Directivo(String nombre, Date fechaIngreso, String numeroTelefono, String cargo, Date fechaPosecion) {
		super(nombre, fechaIngreso,  numeroTelefono);
		// TODO Auto-generated constructor stub
		this.cargo=cargo;
		this.fechaPosecion=fechaPosecion;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setFechaPosecion(Date fechaPosecion) {
		this.fechaPosecion = fechaPosecion;
	}

	public String getCargo(){
		return cargo;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cargo en la mesa directiva: " + cargo + ", Fecha: " + fechaPosecion;
	}
}
