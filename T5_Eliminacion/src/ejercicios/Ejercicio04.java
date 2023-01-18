package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tabla[] = new int[20];
		int num;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*10);
		}
		
		System.out.println("La tabla inicial es: " + Arrays.toString(tabla));
		
		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt();
		
		while(cont<tabla.length) {
			if(tabla[cont] > num) {
				System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - 1 - cont));
				tabla = Arrays.copyOf(tabla, tabla.length-1);
			}
			else {
				cont++;
			}
		}
		System.out.print("La tabla final es: " + Arrays.toString(tabla));
		
		sc.close();
	}

}
