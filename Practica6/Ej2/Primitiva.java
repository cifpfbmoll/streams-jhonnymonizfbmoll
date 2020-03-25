package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Primitiva extends Apuesta {
	private ArrayList<Integer> listanum = new ArrayList<Integer>();
	private int aciertos = 0;
	
	public Primitiva(String nombre, String apellido, int numeroApuesta, ArrayList<Integer> listanum, int aciertos) {
		super(nombre, apellido, numeroApuesta);
		this.listanum = listanum;
		this.aciertos = aciertos;
	}

	public Primitiva(String nombre, String apellido, int numeroApuesta) {
		super(nombre, apellido, numeroApuesta);
	}
	
	public Primitiva(int numeroApuesta) {
		super(numeroApuesta);
	}
	
	public Primitiva() {
	}

	public ArrayList<Integer> getListanum() {
		return listanum;
	}

	public void setListanum(ArrayList<Integer> listanum) {
		this.listanum = listanum;
	}

	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	
	@Override
	public void insertarDatos() {
		super.insertarDatos();
		Scanner lector=new Scanner(System.in);
		int i=0;
		while (i<6) {
			System.out.println("Dime un numero :");
			int numero = lector.nextInt();
			listanum.add(numero);
			i++;
		}
		
	}
	
	@Override
	public void mostrarDatos () {
		super.mostrarDatos();
		System.out.println("Aciertos : " + getAciertos());
	}
	
	 public void datosGanadores() {
		 int i=0;
			while (i<6) {
				int numero = (int) (Math.random()*50+1);
				listanum.add(numero);
				i++;
			}
	 }
	 
	 public void numerosGanadores () {
		 for (int i = 0; i < 6; i++) {
				System.out.println("Apuestas : " + (i+1) + ": " + listanum.get(i) );
			}
	 }
	 
}