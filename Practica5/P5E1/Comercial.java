package P5E1;

import java.util.Scanner;

public class Comercial  extends Empleado{
	
	private int ventasrealizadas;
	private int comision;
	
	public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, int salario,
			int ventasrealizadas, int comision) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.ventasrealizadas = ventasrealizadas;
		this.comision = comision;
	}
	
	public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
	}


	public Comercial() {
		// TODO Auto-generated constructor stub
	}


	public int getVentasrealizadas() {
		return ventasrealizadas;
	}

	public void setVentasrealizadas(int ventasrealizadas) {
		this.ventasrealizadas = ventasrealizadas;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	
	@Override
	public void pedirAlta() {
		super.pedirAlta();
		Scanner lector=new Scanner(System.in);
		System.out.println("ventas realizadas : ");
		int ventasrealizadas=Integer.parseInt(lector.nextLine());
		setVentasrealizadas(ventasrealizadas);
		System.out.println("comision : ");
		int comision=Integer.parseInt(lector.nextLine());
		setComision(comision);
	}

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("1er Apellido: " + super.getApellido1());
        System.out.println("2do Apellido: " + super.getApellido2());
        System.out.println("NIF: " + super.getNif());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Numero ventas realizadas: " + getVentasrealizadas());
        System.out.println("Comision: " + getComision());
    }
}
