package P1;

import java.util.Scanner;

public class practica0 {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// EJERCIO 1
		System.out.println("Hola mundo");
		//EJERCICIO 2
		String nombre= sc.nextLine();
		System.out.println("Hola " + nombre);
		//EJERCICIO 3
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int suma=n1+n2;
	    System.out.println("la suma de " + n1 + " y " + n2 + " es: " + suma);
	    //EJERCICIO 4
	    double a= 2/1;
	    double b=0.342352;
		System.out.println(a+b);
		//EJERCICIO 5
		double n3 = sc.nextFloat();
		double n4 = sc.nextFloat();
		double promedio=(n3+n4)/2;
		System.out.println("El promedio es: "+promedio);

	

	}

}
