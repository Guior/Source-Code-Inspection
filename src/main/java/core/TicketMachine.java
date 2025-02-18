package src.main.java.core;

import src.main.java.exception.PapelMoedaInvalidaException;
import src.main.java.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

	protected int valor;
	protected int saldo;
	protected int[] papelMoeda = { 2, 5, 10, 20, 50, 100 };

	public TicketMachine(int valor) {
		this.valor = valor;
		this.saldo = 0;
	}

	public void inserir(int quantia) throws PapelMoedaInvalidaException {
		boolean achou = false;
		for (int i = 0; i < papelMoeda.length && !achou; i++) {
			if (papelMoeda[i] == quantia) {
				achou = true;
			}
		}
		if (!achou) {
			throw new PapelMoedaInvalidaException("Papel moeda invalida;");
		}
		this.saldo += quantia;
	}

	public int getSaldo() {
		return saldo;
	}

	// public TrocoIterator getTroco() {
	// 	return null;
	// }

	public void imprimir() throws SaldoInsuficienteException {
	    // to-do: retirar tratamento de saldo insuficiente
	    // do metodo de impressao
	    // re-adicionar string
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente da maquina;");
		}
	}
}
