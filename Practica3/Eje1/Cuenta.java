package Eje1;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
	private String cliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	public Cuenta() {
		super();
	}
	
	public Cuenta(String cliente, String numeroCuenta, double tipoInteres, double saldo) {
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta(Cuenta p1) {
		this.cliente = p1.cliente;
		this.numeroCuenta = p1.numeroCuenta;
		this.tipoInteres = p1.tipoInteres;
		this.saldo = p1.saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static Cuenta crearCuenta() {
		Scanner lector=new Scanner(System.in);
		
		System.out.println("Nombre del propietario de la cuenta: ");
		String Cliente=lector.nextLine();
		System.out.println("Numero de cuenta: ");
		String numeroCuenta=lector.nextLine();
		System.out.println("Tipo de interes: ");
		double TipoInteres=Double.parseDouble(lector.nextLine());
		System.out.println("Introduzca el saldo : ");
		double saldo=Double.parseDouble(lector.nextLine());
		return new Cuenta(Cliente,numeroCuenta,TipoInteres,saldo);
	
	}
	
	
	public void ingresoDinero() {
		System.out.println("Su saldo actual: "+this.getSaldo());
		Double ingreso;
		System.out.println("Que cantidad desea ingresar: ");
		Scanner ingresos=new Scanner(System.in);
		ingreso=ingresos.nextDouble();
		this.setSaldo(this.getSaldo()+ingreso);
		System.out.println("Su saldo actual es de : " +this.getSaldo());
		System.out.println("Que desea hacer ahora : ");
		
	}
	
	public void retirarDinero() {
		System.out.println("Su saldo actual: "+this.getSaldo());
		Double retiro;
		System.out.println("Que cantidad desea retirar: ");
		Scanner retirar=new Scanner(System.in);
		retiro=retirar.nextDouble();
		this.setSaldo(this.getSaldo()-retiro);
		System.out.println("Su saldo actual es de : " +this.getSaldo());
		System.out.println("Que desea hacer ahora : ");
		
	}
	
	

		
		
	
}
