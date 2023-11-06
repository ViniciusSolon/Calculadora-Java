package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	// Soma
	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();
		assertEquals(4, c.SomaInteiros(2, 2));
	}
	
	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();
		assertTrue(c.SomaInteiros(3, 7)==10);
		
	}
	//Subtrai
	@Test
	void doisSubtraiDoisEsperazero() {
		Calculadora c = new Calculadora();
		assertEquals(0, c.subtraInteiros(2, 2));
	}
	

	@Test
	void UmSubtraiDezEsperaOnze() {
		Calculadora c = new Calculadora();
		assertFalse(c.subtraInteiros(12, 2)==11);
		
	}
	//Multiplica
	
	@Test
	void QuatroMultiplicaQuatroEsperaDezesseis() {
		Calculadora c = new Calculadora();
		assertNotEquals(15, c.multiplicaInteiros(4, 4));
	}
	
	@Test
	void TresMultiplicaTresEsperaNove() {
		Calculadora c = new Calculadora();
		assertTrue(c.multiplicaInteiros(3, 3)==9);
		
	}
	
	@Test
	void DezDividiCincoEsperaDois() {
		Calculadora c = new Calculadora();
		assertTrue(c.dividiInteiros(10, 5)==2);
	}
	
	@Test
	void VinteDividiQuatroEsperaCinco() {
		Calculadora c = new Calculadora();
		assertEquals(5, c.dividiInteiros(20, 4));
	}
	
	
	
	
	
	
	
}