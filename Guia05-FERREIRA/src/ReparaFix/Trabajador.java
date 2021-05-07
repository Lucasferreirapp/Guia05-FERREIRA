package ReparaFix;

import java.time.Instant;
import java.util.ArrayList;

public class Trabajador {
	
	private String nombre;
	private String email;
	private Oficio oficio;
	private ArrayList<Trabajo> trabajos;
	private double costoPorHora;
	private double porcentajeComision;
	
	public Trabajador(String nombre, String email, Oficio oficio, double costoPorHora, double porcentajeComision) {

		this.nombre = nombre;
		this.email = email;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
		this.porcentajeComision = porcentajeComision;
		this.trabajos = new ArrayList<Trabajo>();
		
	}
	
	public void agregarTrabajo(Trabajo trabajo) throws AgendaOcupadaException, OficioNoCoincideException {
		if(this.mismoOficio(trabajo.getOficio()) && this.agendaLibre(trabajo.getFechaInicio())) {
			this.trabajos.add(trabajo);
		}
	}
	
	public boolean mismoOficio (Oficio oficio) throws OficioNoCoincideException {
		if (this.oficio == oficio) return true;
		else throw new OficioNoCoincideException();
	}
	
	public boolean agendaLibre (Instant fechaInicio) throws AgendaOcupadaException {
		if(this.trabajos.size()>0) {
			boolean diaOcupado = false;
			for(int i=0;i<this.trabajos.size();i++) {
				if(fechaInicio == this.trabajos.get(i).getFechaInicio()) {
					diaOcupado = true;
					break;
				}
			}
			if(diaOcupado) throw new AgendaOcupadaException();
			else return true;
		} else return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Oficio getOficio() {
		return oficio;
	}

	public void setOficio(Oficio oficio) {
		this.oficio = oficio;
	}

	public double getCostoPorHora() {
		return costoPorHora;
	}

	public void setCostoPorHora(double costoPorHora) {
		this.costoPorHora = costoPorHora;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
}

