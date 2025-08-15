import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	// teste de soma
	public void testSomar3Com2() {
		Calculadora calc = new Calculadora();
		double resultadoReal = calc.somar(3, 2);

		double resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de soma
	public void testSomar3ponto5por2ponto5() {
		Calculadora calc = new Calculadora();
		double resultadoReal = calc.somar(3.5, 2.5);

		double resultadoEsperado = 6;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de subtracao
	public void testSubtracao3ponto5por2ponto5() {
		Calculadora calc = new Calculadora();
		double resultadoReal = calc.subtrair(3.5, 2.5);

		double resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de divisao
	public void testDivisao6por2() {
		Calculadora calc = new Calculadora();
		double resultadoReal = calc.dividir(2, 6);

		double resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

}
