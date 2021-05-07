package ReparaFix;

public class ServicioEstandar implements Contratable{

	private Oficio oficio; 
	private Trabajador trabajador;
	private double montoFijo;
	private boolean urgente;
	
	
	public ServicioEstandar (Oficio oficio, Trabajador trabajador, double montoFijo, boolean urgente) {
		this.oficio = oficio; 
		this.trabajador = trabajador;
		this.montoFijo = montoFijo;
		this.urgente = urgente;
	}

	public double calcularCosto() {
		double costoTotal = 0;
		if(this.urgente) {
			double costo = this.montoFijo + (this.montoFijo * this.trabajador.getPorcentajeComision());
			costoTotal += costo*1.5;
		}else {
			costoTotal += montoFijo + (montoFijo * trabajador.getPorcentajeComision());
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

	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	public boolean isUrgente() {
		return urgente;
	}

	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
	
}
