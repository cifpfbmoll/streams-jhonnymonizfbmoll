package Ej1;

import Ej1.FiguraGeometrica;

public class Cono implements FiguraGeometrica{
	private float radioBase;
	private float altura;
	
	
	public Cono(float radioBase, float altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	public Cono() {
		super();
	}

	public float getRadioBase() {
		return radioBase;
	}

	public void setRadioBase(float radioBase) {
		this.radioBase = radioBase;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public void area() {
		double g;
		double area;
		
		g= Math.sqrt(Math.pow(this.radioBase, 2)+Math.pow(this.altura, 2));
		area= Math.PI*this.radioBase*(this.radioBase + g);
		System.out.println("Area del cono es: " + area );
	}

	@Override
	public void volumen() {
		double volumen;
		
		volumen = (Math.PI*Math.pow(this.radioBase, 2)*this.altura)/3;
		System.out.println("Volumen del cono es: " + volumen );
		
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("El radio de la base del cono es: " + this.radioBase  );
		System.out.println("La altura del cono es: " + this.altura  );
		
	}
	

}
