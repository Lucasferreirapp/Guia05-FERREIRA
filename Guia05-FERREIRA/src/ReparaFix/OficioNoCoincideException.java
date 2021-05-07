package ReparaFix;

public class OficioNoCoincideException extends Exception{
	public OficioNoCoincideException() {
		super("El oficio no coincide");
	}
}
