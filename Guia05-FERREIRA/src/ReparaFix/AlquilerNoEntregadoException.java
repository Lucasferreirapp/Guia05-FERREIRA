package ReparaFix;

public class AlquilerNoEntregadoException extends Exception{
	public AlquilerNoEntregadoException() {
		super("Posee m�s de dos alquileres");
	}
}
