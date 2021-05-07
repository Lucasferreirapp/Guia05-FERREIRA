package ReparaFix;

public class ServicioPersonalizado implements Contratable{
	
	private Oficio oficio;
	private Trabajador trabajador;
	private double valorPresupuestado;
	private double costoMateriales;
	private double costoTransporte;
	private boolean urgente;
	
	public ServicioPersonalizado(Oficio oficio, Trabajador trabajador, double valorPresupuestado, double costoMateriales, double costoTransporte, boolean urgente) {
		this.oficio = oficio;
		this.trabajador = trabajador;
		this.valorPresupuestado = valorPresupuestado;
		this.costoMateriales = costoMateriales;
		this.costoTransporte = costoTransporte;
		this.urgente = urgente;
	}

	public double calcularCosto() {
		double costoTotal = 0;
		if(this.urgente) {
			double costo = this.valorPresupuestado + this.costoMateriales + this.costoTransporte;
			costoTotal += costo*1.5;
		}else {
			costoTotal = this.valorPresupuestado + this.costoMateriales + this.costoTransporte;
		}
		return costoTotal;
	} 
	
	public Oficio getOficio() {
		return oficio;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public double getValorPresupuestado() {
		return valorPresupuestado;
	}

	public void setValorPresupuestado(double valorPresupuestado) {
		this.valorPresupuestado = valorPresupuestado;
	}

	public double getCostoMateriales() {
		return costoMateriales;
	}

	public void setCostoMateriales(double costoMateriales) {
		this.costoMateriales = costoMateriales;
	}

	public double getCostoTransporte() {
		return costoTransporte;
	}

	public void setCostoTransporte(double costoTransporte) {
		this.costoTransporte = costoTransporte;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
}
