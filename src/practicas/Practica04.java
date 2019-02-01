package practicas;

import java.util.Scanner;

public class Practica04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		 Scanner leer = new Scanner (System.in);
		 System.out.println("Ingrese su edad: ");
		 edad = leer.nextInt();
		 
		 if (edad >=18) 
		 {
			 System.out.println("Eres mayor de edad");	
		 }
		 else
		 {
			 System.out.println("Eres menor de edad");
		 }

	}

}
