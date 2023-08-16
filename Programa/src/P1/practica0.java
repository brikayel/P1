package P1;

import java.util.Scanner;

public class practica0 {
	
		public static void main(String[] args) {
			
			Scanner in = new Scanner (System.in);
			
			String nombre = "";
			int num1 = 0, num2 = 0;
			
			System.out.println("Nombre");
			nombre = in.nextLine();
			
			System.out.println("primer valor para suma:");
			num1 = in.nextInt();	
			System.out.println("segundo valor para suma:");
			num2 = in.nextInt();	
		
			System.out.println ("hola " + nombre + (num1+num2));
		

	

	}

}
