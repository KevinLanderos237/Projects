package practicas;

import java.util.Scanner;

public class Practica03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		   
		String nombre;
		int edad;
		double estatura;
		
		System.out.println("Ingrese su nombre: ");
		nombre = leer.nextLine(); //ingresar por teclado tipo string
		
		System.out.println("Ingrese su edad: ");
		edad = leer.nextInt(); // ingresar por teclado de tipo entero
		
		System.out.println("Ingrese su estatura: ");
		estatura = leer.nextDouble(); //ingresar por teclado de tipo double
		
		System.out.println("Su nombre es: " + nombre); //estas tres lineas imprimen 
		System.out.println("Su edad es: " + edad);
		System.out.println("estatura es: " + estatura);

	}

}
