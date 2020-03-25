package P5E1;

import java.util.Scanner;

public class Repartidor extends Empleado {
	
	private int horastrabajadas;
	private String zona;
	
	public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, int salario,
			int horastrabajadas, String zona) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.horastrabajadas = horastrabajadas;
		this.zona = zona;
	}
	
	public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
	}


	public Repartidor() {
		// TODO Auto-generated constructor stub
	}

	public int getHorastrabajadas() {
		return horastrabajadas;
	}

	public void setHorastrabajadas(int horastrabajadas) {
		this.horastrabajadas = horastrabajadas;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public void pedirAlta() {
		super.pedirAlta();
		Scanner lector=new Scanner(System.in);
		System.out.println("Horas trabajadas : ");
		int horastrabajadas=Integer.parseInt(lector.nextLine());
		setHorastrabajadas(horastrabajadas);
		System.out.println("zona : ");
		String zona=lector.nextLine();
		setZona(zona);
	}
	

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("1er Apellido: " + super.getApellido1());
        System.out.println("2do Apellido: " + super.getApellido2());
        System.out.println("NIF: " + super.getNif());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Horas trabajadas: " + getHorastrabajadas());
        System.out.println("Zona: " + getZona());
    }
	

}
