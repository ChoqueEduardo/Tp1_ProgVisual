package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj scaner
        Scanner scan = new Scanner(System.in);
        
        //solicitar num entre 1 y 9
        System.out.print("Introduce un número entero entre 1 y 9: ");
        int num;                                                       
        num = scan.nextInt();
        
        //mostrar tabla de multiplicar     
        System.out.println("Tabla del " + num);
        for(int i = 1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + num*i);                                                     
        }
        scan.close();
	}

}
