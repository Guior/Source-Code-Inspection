import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.core.TicketMachine;

public class TicketMachineTest
{
    @Test
    public void quantia100InserirTest ()
    {
		TicketMachine maquina_teste = null;
		int moneda = 0;
  
		try{
			maquina_teste = new TicketMachine(0);
		} catch (Exception e)
			{
				
				;
			}

		try {
			maquina_teste.inserir(100);
		} catch (Exception e){}


		int saldo_atual = maquina_teste.getSaldo();

		assertEquals (100, saldo_atual);
    }
}
