package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Apuesta> apuestas = new ArrayList<Apuesta>();
		int numeroApuesta = 0;
		int opcion = 0;
		while (opcion != 4) {
			Scanner lector=new Scanner(System.in);
			System.out.println("============================");
			System.out.println("1) Crear Apuesta Primitiva.");
			System.out.println("2) Crear Apuesta Quiniela.");
			System.out.println("3) Realizar simualcion.");
			System.out.println("4) Salir.");
			System.out.println("============================");
			opcion=lector.nextInt();
			switch (opcion) {
					case 1:
						Primitiva primitiva = new Primitiva(++numeroApuesta);
						primitiva.insertarDatos();
						primitiva.mostrarDatos();
						apuestas.add(primitiva);
						break;
					case 2:
						Quiniela quiniela = new Quiniela(++numeroApuesta);
						quiniela.insertarDatos();
						quiniela.mostrarDatos();
						apuestas.add(quiniela);
						break;
					case 3:
						ArrayList<Apuesta> simulacion = new ArrayList<Apuesta>();
						Primitiva primitivaGanadora = new Primitiva();
						primitivaGanadora.datosGanadores();
						primitivaGanadora.numerosGanadores();
						simulacion.add(primitivaGanadora);
						Quiniela quinielaGanadora = new Quiniela();
						quinielaGanadora.datosGanadores();
						quinielaGanadora.mostrarDatos();
						simulacion.add(quinielaGanadora);
						
						
					
						break;
					case 4:
						
						break;
					default:
						System.out.println("Opcion no valida.");
						break;
					}
		}
	}
}
