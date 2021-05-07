package ReparaFix;

import java.time.Duration;
import java.time.Instant;

public class Alquiler implements Contratable{
	private Herramienta herramienta;
	private Instant diaInicio;
	private Instant diaFin;
	private Instant diaDevolucion;
	
	public Alquiler(Herramienta herramienta, Instant diaInicio, Instant diaFin) {
		this.herramienta = herramienta;
		this.diaInicio = diaInicio;
		this.diaFin = diaFin;
	}
	
	public int getCantidadDiasContratados() {
		Duration diasContratados;
		diasContratados = Duration.between(this.diaInicio, this.diaFin);
		return (int) diasContratados.toDays();
	}
	
	public int getCantidadDiasRealesContratados() {
		Duration diasContratados;
		if(this.finalizado()) {
			diasContratados = Duration.between(this.diaInicio, this.diaDevolucion);
		} else {
			Instant now = Instant.now();
			diasContratados = Duration.between(this.diaInicio, now);
		}
		
		return (int) diasContratados.toDays();
	}
	
	@Override
	public double calcularCosto() {
		double costoTotal = 0;
		costoTotal += this.herramienta.getCostoPorDia() * this.getCantidadDiasRealesContratados();
		return costoTotal;
	}
	
	public boolean enMora () {
		boolean enMora = this.getCantidadDiasContratados() < this.getCantidadDiasRealesContratados();
		return enMora;
	}
	
	public boolean finalizado() {
		if(this.diaDevolucion != null) return true;
		else return false;
	}
	
	public Herramienta getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	public Instant getDiaInicio() {
		return diaInicio;
	}
	public void setDiaInicio(Instant diaInicio) {
		this.diaInicio = diaInicio;
	}
	public Instant getDiaFin() {
		return diaFin;
	}
	public void setDiaFin(Instant diaFin) {
		this.diaFin = diaFin;
	}
	public void setDiaDevolucion(Instant diaDevolucion) {
		this.diaDevolucion = diaDevolucion;
	}
	public Instant getDiaDevolucion() {
		return diaDevolucion;
	}

}
