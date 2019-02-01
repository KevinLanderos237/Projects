package practicas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practica10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		DecimalFormat formateador=new DecimalFormat("###,###.##");
		byte numero, i=0;
		double suma=0;
		
		
		System.out.println("Ingrese un número del 0 al 76");
		System.out.println("Ningún valor por encima del indicado es invalido.");
		
		do{
			System.out.println("Ingrese los número:");
				numero=op.nextByte();
				if(numero>=0 && numero<=76){
					suma+=numero;
					i++;		
				}
		}while(numero<=76);
			System.out.println("La suma es:"+suma+"El promedio es:"+formateador.format(suma/i));

	}

}
