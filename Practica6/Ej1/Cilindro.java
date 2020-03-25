package Ej1;

import Ej1.FiguraGeometrica;

public class Cilindro  implements FiguraGeometrica{
	
	 private float radioBase;
	 private float altura;
	 
	public Cilindro(float radioBase, float altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	}

		
	public Cilindro() {
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
		double area;
		area =	2*Math.PI*this.radioBase*(this.radioBase+this.altura);	
		System.out.println("Area del cilindro es: " + area );
	}

	@Override
	public void volumen() {
	double volumen;
		
		volumen = (Math.PI*Math.pow(this.radioBase, 2)*this.altura);
		System.out.println("Volumen del cilindro es: " + volumen );
		
	}

	@Override
	public void imprimirCaracteristicas() {
		System.out.println("Calculadora de Jhonny Moniz " );
		System.out.println("El radio del cilindro es: " + this.radioBase  );
		System.out.println("La altura del cilindro es: " + this.altura  );
		this.area();
		this.volumen();
		
	}

}
