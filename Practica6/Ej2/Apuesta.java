package Ej2;

import java.util.Scanner;

public class Apuesta {
 private String nombre;
 private String apellido;
 private int numeroApuesta;
 
public Apuesta(String nombre, String apellido, int numeroApuesta) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.numeroApuesta = numeroApuesta;
}

public Apuesta(int numeroApuesta) {
	this.numeroApuesta = numeroApuesta;
}

public Apuesta() {
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getNumeroApuesta() {
	return numeroApuesta;
}

public void setNumeroApuesta(int numeroApuesta) {
	this.numeroApuesta = numeroApuesta;
}

 
public void insertarDatos() {
	Scanner lector=new Scanner(System.in);
	System.out.println("Nombre : ");
	String nombre=lector.nextLine();
	setNombre(nombre);
	System.out.println("Apellido : ");
	String apellido =lector.nextLine();
	setApellido(apellido);
}

public void mostrarDatos() {
	System.out.println("Nombre : " + getNombre());
	System.out.println("Apellido : " + getApellido());
	System.out.println("Id : " + getNumeroApuesta());
	
}


 


}
