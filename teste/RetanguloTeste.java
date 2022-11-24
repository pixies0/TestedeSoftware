package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.Retangulo;

class RetanguloTeste {
	public Retangulo retangulo;

	@Test
	void test_calcularArea() {
		//Valor esperado para entrada 10, 30 (A=b*h) = 300
		Retangulo retangulo = new Retangulo(10,30);
		assertEquals(300, retangulo.calcularArea());
	}
	
	@Test
	void test_calcularPerimetro() {
		//Valor esperado para entrada 10, 30 (P=2(b+h)) = 80
		Retangulo retangulo = new Retangulo(10,30);
		assertEquals(80, retangulo.calcularPerimetro());
	}

}
