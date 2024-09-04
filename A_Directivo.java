package inputoutput;

public class A_Directivo extends Asociado{
	private String puesto;
	private String cargo;
	private String Fposecion;
	
	public A_Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A_Directivo(int nsocio, String nombre, int fingreso, int ntel, String tipo) {
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
	
	@Override
	public String toString() {
		return "A_Directivo [puesto=" + puesto + ", cargo=" + cargo + ", Fposecion=" + Fposecion + ", toString()="
				+ super.toString() + "]";
	}
	
}
