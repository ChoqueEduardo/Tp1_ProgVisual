package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear obj scaner
        Scanner scanner = new Scanner(System.in);

        // solicitar un numero entre 0 y 10
        System.out.print("Ingrese un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        // validacion del numero dentro del rango
        if (numero < 0 || numero > 10) {
            System.out.println("El número debe estar dentro del rango [0, 10].");
        } else {
            // calculo del factorial con while
            int factorial = 1;
            int contador = 1;
            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }

            // Mostrar el resultado por consola
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerrar el objeto Scanner
        scanner.close();

	}

}
