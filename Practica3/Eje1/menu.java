package Eje1;

import java.util.*;

public class menu {
	
	public static Cuenta obtenerCuenta(ArrayList<Cuenta> cuentas, String numero) {
		int i = 0;
        while (i < cuentas.size()) {
            if (cuentas.get(i).getNumeroCuenta().equals(numero)) {
            	return cuentas.get(i);
            	// lista.indexof(objeto)) para encontar la posicion del objeto en la array.
            	// referencia del objeto.
            }
            i ++;   
        }
        return null;
 
	}
	
	public static void main(String[] args) {
		ArrayList <Cuenta> cuentas = new ArrayList<Cuenta>();
		int opcion2 = 0;
		int opcion = 0;

		
		while (opcion != 3) {	
			System.out.println("1) Crear un cuenta.");
			System.out.println("2) Iniciar sesion.");
			System.out.println("3) salir.");
			
			Scanner option=new Scanner(System.in);
			opcion=option.nextInt();
			switch (opcion) {
			case 1:
				cuentas.add(Cuenta.crearCuenta());
			//	System.out.println(cuentas.get(0).getNumeroCuenta());
				break;
			case 2:
				
				String numero;
				System.out.println("Ingrese el numero de cuenta al que desea acceder: ");
				Scanner numeroo=new Scanner(System.in);
				numero=numeroo.nextLine();
				Cuenta cuenta = obtenerCuenta(cuentas,numero);
				while (opcion2 != 4) {
					System.out.println("1) ingresar dinero.");
					System.out.println("2) retirar dinero.");
					System.out.println("3) transferencia de  dinero.");
					System.out.println("4) Salir.");
					Scanner optioon2=new Scanner(System.in);
					opcion2=optioon2.nextInt();
							switch (opcion2) {
								case 1:
									cuenta.ingresoDinero();
								
									break;
								case 2:
									cuenta.retirarDinero();
								
									break;
								case 3:
									tranferenciaDinero(cuentas, cuenta);
									break;		
									
								default:
									
									break;
							}
				}
				break;
			
			default:
				
				break;
		}
		}
	}

	public static void tranferenciaDinero(ArrayList<Cuenta> cuentas, Cuenta cuenta) {
		String transcuenta;
		Double transferencia;
		System.out.println("Dime cuanto desea transferir: ");
		Scanner tranferencias=new Scanner(System.in);
		transferencia=tranferencias.nextDouble();
		cuenta.setSaldo(cuenta.getSaldo()-transferencia);
		System.out.println("Dime el numero de la cuenta a la que quieres hacer la tansferencia: ");
		Scanner transCuentas=new Scanner(System.in);
		transcuenta=transCuentas.nextLine();
		Cuenta cuenta2 = obtenerCuenta(cuentas,transcuenta);
		cuenta2.setSaldo(cuenta2.getSaldo()+transferencia);
		System.out.println("Su saldo actual es de : " +cuenta2.getSaldo());
	}

}
