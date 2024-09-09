package clasesAbs;

import java.util.Date;

public class A_Natural extends Asociado{
	private float aportacion;
	private int cantAport;
	private Date fecUltimaAport;
	
	public A_Natural() {
		super();
	}
	public A_Natural(int numeroSocio, String nombre, Date fechaIngreso, int numeroTelefono, 
			String tipoAsociado, float aportacion, int cantAport, Date fecUltimaAport) {
		super(numeroSocio, nombre, fechaIngreso, numeroTelefono);
        this.aportacion = aportacion;
        this.cantAport = cantAport;
        this.fecUltimaAport = fecUltimaAport;        
	}
	
	public float getAportacion() {
		return aportacion;
	}
	public void setAportacion(float val) {
		this.aportacion = val;
	}
	public int getCantAport() {
		return cantAport;
	}
	public void setCantAport(int val) {
		this.cantAport = val;
	}
	public Date getFecUltimaAport() {
		return fecUltimaAport;
	}
	public void setFecUltimaAport(Date val) {
		this.fecUltimaAport = val;
	}

	public float totalAportaciones(){
		return aportacion;
	}

	@Override
	public String toString(){
		return super.toString() +"\nTotal en aportaciones: " + totalAportaciones() +
		"\nCantidad de aportaciones: " + cantAport +
		"\nFecha de la ultima aportación: " + fecUltimaAport;
	}
}
