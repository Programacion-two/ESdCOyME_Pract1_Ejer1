package programa;

import java.util.Scanner;

public class Programa {

	String apellido;
	int edad;
	double altura;
	int cedula;
				
			
	Scanner entrada=new Scanner(System.in);
			
				
	public void iniciar(){		
		cargar();
		imprimir();
				
	}
				
				
			//Escribir aquí el método cargar
			//Este método deberá cargar desde el teclado los datos necesarios
	public void cargar() {
		System.out.println("ingrese apellido");
		apellido=entrada.nextLine();
					 
		System.out.println("ingrese edad");
		edad=entrada.nextInt();
					 
		System.out.println("ingrese altura");
		altura=entrada.nextDouble();
					 
		System.out.println("ingrese cedula");
		cedula=entrada.nextInt();
					 
					 
					 
	}

			//Escribir aquí el método imprimir
			//Este método deberá mostrar en pantalla  los datos cargados
	public void imprimir() {
		System.out.println("su apellido es: " + apellido);
		System.out.println("su edad es: " + edad + " años");
		System.out.println("su altura es: " + altura);
		System.out.println("su cedula es: " + cedula);
					 
	}




		


}


