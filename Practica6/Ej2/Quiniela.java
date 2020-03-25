package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiniela extends Apuesta {
	private ArrayList<Integer> opciones = new ArrayList<Integer>();

	public Quiniela(String nombre, String apellido, int numeroApuesta, ArrayList<Integer> opcion) {
		super(nombre, apellido, numeroApuesta);
		this.opciones = opcion;
	}

	public Quiniela(String nombre, String apellido, int numeroApuesta) {
		super(nombre, apellido, numeroApuesta);
	}

	public Quiniela() {
	}

	public Quiniela(int numeroApuesta) {
		super(numeroApuesta);
	}
	
	public ArrayList<Integer> getOpcion() {
		return opciones;
	}

	public void setOpcion(ArrayList<Integer> opcion) {
		this.opciones = opcion;
	}

	@Override
	public void insertarDatos() {
		super.insertarDatos();
		Scanner lector=new Scanner(System.in);
		int i=0;
		while (i<15) {
			System.out.println("Dime tus resultados :");
			String numero = lector.nextLine();
			System.out.println(numero);
				if (numero.equals("1")) {
					opciones.add(1);
				}
				else if (numero.equals("2")) {
					opciones.add(2);
				}
				else if (numero.equals("x")) {
					opciones.add(0);
				}
			i++;
		}
	}

	@Override	
	public void mostrarDatos () {
		super.mostrarDatos();
		for (int i = 0; i < opciones.size(); i++) {
			System.out.println("Apuestas : " + (i+1) + ": " + opciones.get(i) );
		}
		
	}
	
	 public void datosGanadores() {
		 int i=0;
			while (i<15) {
				int numero = (int) (Math.random()*3);
				opciones.add(numero);
				i++;
			}
	 }
}
