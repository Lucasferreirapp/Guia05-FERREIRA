package ReparaFix;

public class Herramienta {

	private String nombre;
	private Double costoPorDia;
	
	public Herramienta(String nombre, Double costoPorDia) {
		this.nombre = nombre;
		this.costoPorDia = costoPorDia;
	}

	
	//Getters and Setters	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getCostoPorDia() {
		return costoPorDia;
	}
	public void setCostoPorDia(Double costoxDia) {
		this.costoPorDia = costoxDia;
	}
}
