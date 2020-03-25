package Ej1;


import Ej1.FiguraGeometrica;

public class Cubo implements FiguraGeometrica{
	private float ladoBase;

	public Cubo(float ladoBase) {
		super();
		this.ladoBase = ladoBase;
	}
	
	public Cubo() {
		super();
	}

	public float getLadoBase() {
		return ladoBase;
	}

	public void setLadoBase(float ladoBase) {
		this.ladoBase = ladoBase;
	}

	@Override
	public void area() {
		double area;
		float ladobase = getLadoBase();
		area = Math.pow(ladobase, 2);
		System.out.println("Area del cuadrado: " + area );
		
	}

	@Override
	public void volumen() {
		double volumen;
		float ladobase = getLadoBase();
		volumen = Math.pow(ladobase, 3);
		System.out.println("Volumen del cuadrado: " + volumen );
		
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("Un lado del cubo es: " + getLadoBase() );
		this.area();
		this.volumen();
		
	}

}
