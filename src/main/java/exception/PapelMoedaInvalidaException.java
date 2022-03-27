package src.main.java.exception;
import java.lang.String;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    
    public PapelMoedaInvalidaException(String mensagem)
    {
	super(mensagem);
    }
}
