import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.core.TicketMachine;
import src.main.java.exception.PapelMoedaInvalidaException;

public class TicketMachineTest {
	@Test
	public void quantia100InserirTest() {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);

		try {
			maquina_teste.inserir(100);
		} catch (Exception e) {
		}

		int saldo_atual = maquina_teste.getSaldo();

		assertEquals(100, saldo_atual);
	}

	@Test
	public void quantia0InserirTest() {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);

		try {
			maquina_teste.inserir(0);
		} catch (Exception e) {
		}

		int saldo_atual = maquina_teste.getSaldo();

		assertEquals(0, saldo_atual);
	}

	@Test
	public void quantiaNegativaInserirTest() {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);

		try {
			maquina_teste.inserir(-100);
		} catch (Exception e) {
		}

		int saldo_atual = maquina_teste.getSaldo();

		assertEquals(0, saldo_atual);
	}

	@Test(expected = PapelMoedaInvalidaException.class)
	public void quantiaImparInserirTest() throws PapelMoedaInvalidaException {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);
		maquina_teste.inserir(3);

		int saldo_atual = maquina_teste.getSaldo();
	}

	@Test(expected = PapelMoedaInvalidaException.class)
	public void quantiaCompostaInserirTest() throws PapelMoedaInvalidaException {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);
		maquina_teste.inserir(432);

		int saldo_atual = maquina_teste.getSaldo();
	}

	@Test
	public void quantiaMultiplosInserirTest() {
		TicketMachine maquina_teste = null;

		maquina_teste = new TicketMachine(0);

		try {
			maquina_teste.inserir(100);
			maquina_teste.inserir(50);
			maquina_teste.inserir(20);
			maquina_teste.inserir(100);
			maquina_teste.inserir(2);
			maquina_teste.inserir(10);
			maquina_teste.inserir(5);
			maquina_teste.inserir(2);
			maquina_teste.inserir(50);
		} catch (Exception e) {
		}

		int saldo_atual = maquina_teste.getSaldo();

		assertEquals(339, saldo_atual);
	}
}
