package P5E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Scanner option=new Scanner(System.in);
		int opcion = 0;
		while(opcion !=3) {
			System.out.println("==============================================");
			System.out.println("1) Dar de Alta.");
			System.out.println("2) Mostrar Atributos.");
			System.out.println("3) Salir.");
			
			opcion=option.nextInt();
			switch (opcion) {
					case 1:{
						int opcion2;
						System.out.println("==============================================");
						System.out.println("1) Dar de alta empleado.");
						System.out.println("2) Dar de alta comercial.");
						System.out.println("3) Dar de alta repartidor.");
						System.out.println("4) Salir.");
						System.out.println("==============================================");
						Scanner option2=new Scanner(System.in);
						opcion2=option2.nextInt();
						switch (opcion2) {
							case 1:
								Empleado emp = new Empleado();
								emp.pedirAlta();
								empleados.add(emp);
								break;
							case 2:
								Comercial comercial = new Comercial();
								comercial.pedirAlta();
								empleados.add(comercial);
								break;
							case 3:
								Repartidor repartidor = new Repartidor();
								repartidor.pedirAlta();
								empleados.add(repartidor);
								break;
							case 4:
								break;
							default:
								System.out.println("La opcion no es valida.");
								break;
							}
					}
					case 2:
						int opcion3;
						System.out.println("==============================================");
						System.out.println("1) Mostrar atributos empleado.");
						System.out.println("2) Mostrar atributos comercial.");
						System.out.println("3) Mostrar atributos repartidor.");
						System.out.println("==============================================");
						Scanner option3=new Scanner(System.in);
						opcion3=option3.nextInt();
						switch (opcion3) {
							case 1:
								 for (Empleado emp : empleados) {
			                            if (emp instanceof Empleado) {
			                                emp.mostrarAtributos();
			                            }
								 }
								break;
							case 2:
								 for (Empleado emp : empleados) {
			                            if (emp instanceof Comercial) {
			                            	 ((Comercial)emp).mostrarAtributos();
			                            }
								 }
								break;
							case 3:
								 for (Empleado emp : empleados) {
			                            if (emp instanceof Repartidor) {
			                            	((Repartidor)emp).mostrarAtributos();
			                            }
								 }
								break;
	
							default:
								System.out.println("La opcion no es valida.");
								break;
							}
					case 3:
						
						break;
					default:
						System.out.println("La opcion no es valida.");
						break;
			}
		}
	}
}
