import java.util.Scanner;

public class AreaRectangulo {
	 private double altura;
	 private double base;

	//CONSTRUCTORES
	public AreaRectangulo() {
		
	}
	public AreaRectangulo(double altura, double base) {
		
		this.altura = altura;
		this.base = base;
	}

	//GETTERS Y SETTERS
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	//METODO
	public double calcularArea() {//METODO EN CLASE
		return this.base * this.altura;
	}


}
