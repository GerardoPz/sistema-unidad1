package inputoutput;

public class A_Directivo extends Asociado{
	private String puesto;
	private String cargo;
	private String Fposecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A_Directivo(int numeroSocio, String nombre, int fechaIngreso, int numeroTelefono, String tipoAsociado) {
		super(nsocio, nombre, fingreso, ntel, tipo);
		// TODO Auto-generated constructor stub
		this.puesto=puesto;
		this.cargo=cargo;
		this.Fposecion=Fposecion;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setFposecion(String fposecion) {
		Fposecion = fposecion;
	}
	
}
