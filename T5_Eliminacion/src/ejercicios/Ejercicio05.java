package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int luckyNums;
		int media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de números de la suerte que tiene: ");
		luckyNums = sc.nextInt();
		
		int tabla[] = new int[luckyNums];
		
		for(int i=0; i<tabla.length; i++) {
			System.out.print("Introduzca un número de la suerte: ");
			tabla[i] = sc.nextInt();
		} 
		
		Arrays.sort(tabla);
		
		sc.close();
	}

}
