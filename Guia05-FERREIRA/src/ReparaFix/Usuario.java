package ReparaFix;

import java.util.ArrayList;

public class Usuario {

	private String nombre ;
	private String email; 
	private ArrayList<Contratable> contratables;
	
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
		this.contratables = new ArrayList<Contratable>();
	}
	
	public boolean puedeAlquilar() throws AlquilerNoEntregadoException{
		if(this.contratables.size()>2) {
			int alquileresNoEntregados = 0; 
			for(int i=0;i<contratables.size();i++) {
				if(this.contratables.get(i) instanceof Alquiler) {
					Alquiler alquiler = (Alquiler) this.contratables.get(i);
					if (alquiler.getDiaDevolucion() == null) {
						alquileresNoEntregados++;
					}
				}
			}
			if(alquileresNoEntregados <= 2) return true;
			else throw new AlquilerNoEntregadoException();
		} else return true;		
	}
	
	public void contratar (Contratable contratable) throws AlquilerNoEntregadoException {
		if(this.puedeAlquilar()) this.contratables.add(contratable);
	}
	
}