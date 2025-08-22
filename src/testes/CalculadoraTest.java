package testes;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fontes.Calculadora;

public class CalculadoraTest {
	
	private String nomeTeste;
	private Calculadora calc;
	private double resultadoReal;
	
	// executado antes
	@Before
	public void inicioTeste() {
		System.out.println("Iniciando Calculo");
		calc = new Calculadora();
	}
	
	// executado depois
	@After
	public void terminoTeste() {
		System.out.println(nomeTeste);
		System.out.println("Calculo finalizado. Resultado: " + resultadoReal);

	}

	@Test
	// teste de soma
	public void testSomar3Com2() {
		nomeTeste = "Somar 2 com 2";
		resultadoReal = calc.somar(3, 2);

		double resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}
	
	@Test
	// teste de soma
	public void testSomar3ponto5por2ponto5() {
		nomeTeste = "Somar 3.5 com 2.5";
		resultadoReal = calc.somar(3.5, 2.5);

		double resultadoEsperado = 6;
		assertEquals(resultadoEsperado, resultadoReal, 0);
		System.out.println("Finalizando testSomar3ponto5por2ponto5");
	}
	
	@Test
	// teste de subtracao
	public void testSubtracao3ponto5por2ponto5() {
		nomeTeste = "Subtracao 3.5 por 2.5";
		resultadoReal = calc.subtrair(3.5, 2.5);

		double resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultadoReal, 0);
		System.out.println("Finalizando testSubtracao3ponto5por2ponto5");
	}
	
	@Test
	// teste de divisao
	public void testDivisao6por2() {
		nomeTeste = "Divisao 6 por 2";
		resultadoReal = calc.dividir(2, 6);

		double resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoReal, 0);
		System.out.println("Finalizando testDivisao6por2");
	}

}
