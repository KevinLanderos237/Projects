package practicas;

import java.util.Scanner;

public class Practica07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c, f;
    	Scanner leer = new Scanner (System.in);
    	System.out.println("Ingrese un valor de temperatura en grados Fahrenheit: ");
    	
    	f = leer.nextFloat();
    	
    	c=(float) ((f-32)/1.8);
    	System.out.println("Los grados en fahrenheit son " + f);
    	System.out.println("Los grados en centigrados son " + c);
    	

	}

}
