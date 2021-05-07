package ReparaFix;

public class AlquilerNoEntregadoException extends Exception{
	public AlquilerNoEntregadoException() {
		super("Posee más de dos alquileres");
	}
}
