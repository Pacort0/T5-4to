package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int luckyNums; //Variable para guardar la cantidad de números de la suerte del usuario
		int media; //Variable para guardar el cálculo de la media entre dos números
		int num1, num2; //Variable para guardar cada número random
		 
		Scanner sc = new Scanner(System.in); //Escáner del programa
		
		System.out.print("Introduzca la cantidad de números de la suerte que tiene: ");
		luckyNums = sc.nextInt(); //Guardamos el valor introducido
		
		int tabla[] = new int[luckyNums]; //Creamos la tabla con tamaño para guardar todos los valores indicados
		
		//Rellenamos la tabla con valores del usuario
		for(int i=0; i<tabla.length; i++) { 
			System.out.print("Introduzca un número de la suerte: ");
			tabla[i] = sc.nextInt();
		} 
		while(tabla.length != 1) { //Mientras la longitud de la tabla sea diferente de 1, sigue el bucle while
			Arrays.sort(tabla); //Ordenamos la tabla
			
			num1 = (int)(Math.random()*tabla.length-1); //Le damos un valor aleatorio entre 0 y la cantidad de posiciones de la tabla al primer num
			do {
				num2 = (int)(Math.random()*tabla.length-1); //Le damos un valor DIFERENTE al segundo número
			}while(num2==num1);
			
			media = (tabla[num1] + tabla[num2]) /2; //Calculamos la media aritmética de ambos números
			tabla[num2] = media; //Insertamos el valor de la media en la tabla en lugar de uno de los números
			
			System.arraycopy(tabla, num1+1, tabla, num1, (tabla.length-num1-1)); //Machacamos el otro número
			tabla = Arrays.copyOf(tabla, tabla.length-1);//Nos deshacemos del 0 al final de la tabla
		}
		
		System.out.print("Tu número de la suerte es el: " + Arrays.toString(tabla)); //Mostramos el número de la suerte
		
		sc.close();
	}

}