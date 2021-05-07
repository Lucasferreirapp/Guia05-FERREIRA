package ReparaFix;

import java.time.Instant;

public class Trabajo {	
	
	private Oficio oficio;
	private ServicioEstandar servicioEstandar;
	private ServicioPersonalizado servicioPersonalizado;
	private Instant fechaInicio;
	private Instant fechaFin;
	
	public Trabajo(Oficio oficio, ServicioEstandar servicioEstandar,Instant fechaInicio, Instant fechaFin) {
		this.oficio = oficio;
		this.servicioEstandar = servicioEstandar;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public Trabajo(Oficio oficio, ServicioPersonalizado servicioPersonalizado,Instant fechaInicio, Instant fechaFin) {
		this.oficio = oficio;
		this.servicioPersonalizado = servicioPersonalizado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
	public boolean finalizado() {
		if(this.fechaFin != null) return true;
		else return false;
	}

	public Oficio getOficio() {
		return oficio;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	public ServicioEstandar getServicioEstandar() {
		return servicioEstandar;
	}

	public void setServicioEstandar(ServicioEstandar servicioEstandar) {
		this.servicioEstandar = servicioEstandar;
	}

	public ServicioPersonalizado getServicioPersonalizado() {
		return servicioPersonalizado;
	}

	public void setServicioPersonalizado(ServicioPersonalizado servicioPersonalizado) {
		this.servicioPersonalizado = servicioPersonalizado;
	}

	public Instant getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Instant getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Instant fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
}
