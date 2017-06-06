package imc;

import org.junit.Assert;
import org.junit.Test;

import edu.femxa.val.imc.IMC;
import edu.femxa.val.imc.Persona;
import edu.femxa.val.imc.TipoIMC;

public class IMCTest {

	@Test
	public final void IMCNormal () 
	{
		//desarrollo un caso de prueba para comprobar que funciona el imc normal
		
		Persona p = new Persona(80d, 1.87d);
		double imc = IMC.calcula(p);
		TipoIMC tipo = TipoIMC.traduceIMC(imc);
		Assert.assertEquals(TipoIMC.NORMAL, tipo );
		//Assert.assertEquals(TipoIMC.DESNUTRIDO, tipo );
	}
	
	@Test(expected = AssertionError.class)
	public final void IMCNormalFallo ()
	{
		Persona p = new Persona(80d, 1.87d);
		double imc = IMC.calcula(p);
		TipoIMC tipo = TipoIMC.traduceIMC(imc);
		Assert.assertEquals(TipoIMC.DESNUTRIDO, tipo );
	}
}
