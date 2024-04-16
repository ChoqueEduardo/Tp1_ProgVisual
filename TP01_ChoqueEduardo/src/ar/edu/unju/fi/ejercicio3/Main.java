package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear obj. scanner
		Scanner scan = new Scanner(System.in);
		
		//solicitar un numero entero
		System.out.print("Ingresar un Nº entero ");
		int numero = scan.nextInt();
		
		//calculo para saber si el Nº es par o impar
		int resultado;
		if (numero % 2 ==0) 
			resultado = numero * 3; // si es par mostrar el triple
		else  resultado = numero * 2; //si es impar mostrar el doble
		
		//mostrar resultado por consola
		System.out.println("El resultado es " + resultado);
		
		// cerrar scanner
		scan.close();	
		
		

	}

}
