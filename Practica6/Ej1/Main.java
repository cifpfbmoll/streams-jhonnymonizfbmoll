package Ej1;

public class Main {
	public static void main(String[] args) {
		
		Cubo micubo = new Cubo(12);
		Cono micono = new Cono(6,10);
		Cilindro micilindro = new Cilindro(10,20);
		
		micilindro.imprimirCaracteristicas();
		micubo.imprimirCaracteristicas();
	}
	
}
