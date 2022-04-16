import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.core.PapelMoeda;

public class PapelMoedaTest {

    @Test
    public void instanciarUnicoPapelMoedaTest ()
    {
	PapelMoeda papel_teste = new PapelMoeda (100, 1);

	assertEquals (100, papel_teste.getValor ());
	assertEquals (1, papel_teste.getQuantidade ());
    }

    @Test
    public void instanciarVariosPapeisMoedaTest ()
    {
	PapelMoeda papel_teste = new PapelMoeda (10, 90);

	assertEquals (10, papel_teste.getValor ());
	assertEquals (90, papel_teste.getQuantidade ());
    }

    // Exception genérica não é muito descritiva nesse momento
    // Testes certamente irão falhar
    @Test(expected = Exception.class)
    public void instanciarUnicoPapelMoedaNegativoTest () throws Exception
    {
	PapelMoeda papel_teste = new PapelMoeda (-1, 1);
    }

    @Test(expected = Exception.class)
    public void instanciarVariosPapeisMoedaNegativosTest () throws Exception
    {
	PapelMoeda papel_teste = new PapelMoeda (-1, 90);
    }

}
