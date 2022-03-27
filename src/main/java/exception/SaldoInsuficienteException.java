package src.main.java.exception;
import java.lang.String;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem)
    {
	super(mensagem);
    }
}
