package practicas;

import java.util.Scanner;

public class Practica05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cal;
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese su calificacion: ");
		cal = leer.nextDouble();
		
		if (cal >= 80)
		{
			System.out.println("Aprobado");
		}
		else
		{
			System.out.println("Reprobado");
		}

	}

}
