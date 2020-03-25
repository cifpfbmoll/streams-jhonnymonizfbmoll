package P5E1;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private int  edad;
	private int salario;
	
	public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.edad = edad;
		this.salario = salario;
	}
	
	public Empleado() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void pedirAlta() { // si se va a realizar una herencia no puede se un metodo estatico.
		Scanner lector=new Scanner(System.in);
		System.out.println("Nombre : ");
		String nombre=lector.nextLine();
		setNombre(nombre);
		System.out.println("1er Apellido : ");
		String apellido1=lector.nextLine();
		setApellido1(apellido1);
		System.out.println("2do Apellido : ");
		String apellido2=lector.nextLine();
		setApellido2(apellido2);;
		System.out.println("NIF : ");
		String nif=lector.nextLine();
		setNif(nif);
		System.out.println("Edad : ");
		int edad=Integer.parseInt(lector.nextLine());
		System.out.println("Salario : ");
		int salario=Integer.parseInt(lector.nextLine());
		setSalario(salario);
	}
	 public void mostrarAtributos() {
	        System.out.println("Nombre: " + getNombre());
	        System.out.println("1er Apellido: " + getApellido1());
	        System.out.println("2do Apellido: " + getApellido2());
	        System.out.println("N: " + getNif());
	        System.out.println("Edad: " + getEdad());
	        System.out.println("Salario: " + getSalario());
	    }
}
