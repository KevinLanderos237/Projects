package practicas;

import java.util.Scanner;

public class Practica09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte opc;
		float num;
		double resp;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese el número de la operación que quiere realizar");
		System.out.println("1.- Pulgadas a centímetros.");
		System.out.println("2.- Pies a centímetros.");
		System.out.println("3.- Pies a pulgadas.");
				
		
		opc=leer.nextByte();
		
		
		
		switch(opc){
		
		case 1:
			System.out.println("Ingrese la cantidad pulgadas");
			num=leer.nextFloat();
			resp=num*2.54;
			System.out.println("La cantidad en pulgadas es "+ resp );
			break;
			
			
		case 2:
			System.out.println("Ingrese la cantidad pulgadas");
			num=leer.nextFloat();
			resp=num*30.48;
			System.out.println("La cantidad en centímetros "+ resp );
			break;
		
			
		case 3:
			System.out.println("Ingrese la cantidad en pies");
			num=leer.nextFloat();
			resp=num*12;
			System.out.println("La cantidad en pulgadas es "+ resp );
			break;
			
		default:
			System.out.println("Opcion no válida");
			

	}

	}

}
