package controle;

import dominio.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(10,20);
		
		var area = retangulo.calcularArea();
		System.out.println(area);
		
		var perimetro = retangulo.calcularPerimetro();
		System.out.println(perimetro);

	}

}
