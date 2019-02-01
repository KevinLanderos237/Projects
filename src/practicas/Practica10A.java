package practicas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practica10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		byte s=1;
		byte c;
		double n=0.0, t=0.0;
		DecimalFormat formateador=newDecimalFormat("###,###.##");
		
		System.out.println("¿Cuantos productos desea ingresar?");
			c=op.nextByte();
			
		do{
			System.out.println("Ingrese el valor del producto"+s);
			n=op.nextDouble();
				t=t+n;
			
			s++;
		}while(s<=c);
			
			
		if ((t>=1500)){
				t=t*1.11;
		}else{
			System.out.println("El monto total es"+t+"El total es:"+(t*1.1));
	
		}
		
			System.out.print("El resultado con aumento es "+t);
			

	}

	private static DecimalFormat newDecimalFormat(String string) {
		// TODO Auto-generated method stub
		return null;

	}

}
