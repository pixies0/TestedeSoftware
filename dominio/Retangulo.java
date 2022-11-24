package dominio;

public class Retangulo {
	
	private float base;
	private float altura;
	
	public Retangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() {
		return base * altura;
	}
	
	public float calcularPerimetro() {
		return 2*(base + altura);
	}
}
