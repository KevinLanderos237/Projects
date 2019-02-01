package practicas;

import java.util.Scanner;

public class Practica08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte dia;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Selecciona el día (1-7)");
		
		dia=leer.nextByte();
		
		switch(dia){
		
		case 1:
			System.out.println("Lunes");
			break;
		
		case 2:
			System.out.println("Martes");
			break;
		
		case 3:
			System.out.println("Miercoles");
			break;
		
		case 4:
			System.out.println("Jueves");
			break;
			
		case 5:
			System.out.println("Viernes");
			break;
			
		case 6:
			System.out.println("Sábado");
			break;
			
		case 7:
			System.out.println("Domingo");
			break;
		
		default:
			System.out.println("El numero ingresado no es válido");
			

	}

	}

}
