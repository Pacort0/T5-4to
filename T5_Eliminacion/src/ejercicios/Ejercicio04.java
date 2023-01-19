package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tabla[] = new int[20]; //Tabla con tamaño determinada
		int num; //Variable para guardar el número 'techo'
		int cont = 0; //Contador para el bucle while
		
		Scanner sc = new Scanner(System.in); //Escáner del programa
		
		//Rellenamos la tabla con números aleatorios del 0 al 10
		for(int i = 0; i < tabla.length; i++) { 
			tabla[i] = (int)(Math.random()*10+1);
		}
		
		//Mostramos la tabla inicial
		System.out.println("La tabla inicial es: " + Arrays.toString(tabla));
		
		System.out.print("Introduzca un número entero: "); 
		num = sc.nextInt(); //Guardamos el número introducido
		
		while(cont<tabla.length) { //Mientras el contador no supere la longitud de la tabla
			if(tabla[cont] > num) { //Si el valor de tabla[i] es superior al del número techo:
				System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - 1 - cont)); //Machacamos el valor en tabla[i]
				tabla = Arrays.copyOf(tabla, tabla.length-1);//Nos deshacemos del 0 al final de la tabla
			}
			else {
				cont++; //Si no es mayor que el número techo, aumentamos el contador
			}
		}
		System.out.print("La tabla final es: " + Arrays.toString(tabla)); //Mostramos la tabla final
		
		sc.close(); //Cerramos el escáner
	}

}
