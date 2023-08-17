package P1;
import java.util.Scanner;
public class practica0p2 {
	
//FUNCIÓN EJERCICIO 6
public static double suma (double a,double b) {
		return a+b;
	}
//FUNCIÓN EJERCICIO 7
public static double promedio (double a,double b) {
	return (a+b)/2;
}
//FUNCIÓN EJERCICIO 8
public static void nota (double a,double b) {
	double calculo=((a+b)/2);
	if (calculo>=7) {
		System.out.println("aprobó");
	  }else if (calculo<7 && calculo>=4) {
		  System.out.println("el alumno regularizó");  
	  }else {
		  System.out.println("el alumno desaprobó");
	  }
	}
//FUNCIÓN EJERCICIO 9
public static void imprimirfecha (int dia, int mes, int año) {

	String nombremes="";
	if (mes<1 || mes>12 || dia>31 || (mes==2 && dia>28) || ((mes==4 || mes==6 || mes==9 || mes==11) && dia>30)){
		System.out.println("El mes y/o día no es válido");
	}
	else if (mes==1) {
		nombremes=nombremes + "enero";
	}
	else if (mes==2) {
		nombremes=nombremes + "febrero";		
	}
	else if (mes==3) {
		nombremes=nombremes + "marzo";		
	}
	else if (mes==4) {
		nombremes=nombremes + "abril";		
	}
	else if (mes==5) {
		nombremes=nombremes + "mayo";		
	}
	else if (mes==6) {
		nombremes=nombremes + "junio";		
	}
	else if (mes==7) {
		nombremes=nombremes + "julio";		
	}
	else if (mes==8) {
		nombremes=nombremes + "agosto";		
	}
	else if (mes==9) {
		nombremes=nombremes + "septiembre";		
	}
	else if (mes==10) {
		nombremes=nombremes + "octubre";		
	}
	else if (mes==11) {
		nombremes=nombremes + "noviembre";		
	}
	else if (mes==12) {
		nombremes=nombremes + "diciembre";		
	}
	else if (mes<1 || mes>12 || dia>31){
		System.out.println("El mes y/o día no es válido");
	}
	System.out.println(dia+ " de " + nombremes + " de " + año );     
}
	
		

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c= sc.nextDouble();
		double d= sc.nextDouble();
//EJECUCIÓN EJERCICIO 6 Y 7
		double resultado=suma(c,d);
		double resultado2=promedio(c,d);
		System.out.println("la suma es: "+resultado);
		System.out.println("el promedio es: "+resultado2);
//EJECUCIÓN EJERCICIO 8
		nota(c,d);
//EJECUCIÓN EJERCICIO 9
		int dia=sc.nextInt();
		int mes=sc.nextInt();
		int año=sc.nextInt();
		imprimirfecha(dia,mes,año);
	
		
		

	
	}

}
