package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		int aBorrar;
		String opcion;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
		}
		
		//Se imprime al menos una vez
		do {	
			//Menú del programa
			System.out.println("ELIJA UNA OPCIÓN: \n"
					+ "A) Mostrar valores\n"
					+ "B) Eliminar valor\n"
					+ "C) Salir");
				opcion = sc.next();
			//Según la opción introducida
			switch(opcion) {
			case "a": //opción 'a'
				System.out.println(Arrays.toString(tabla)); //Mostramos la tabla
				break;
			case "b": //opción 'b'
				System.out.print("Introduzca el valor que desea eliminar: ");
				aBorrar = sc.nextInt();
				for(int j = 0; j < tabla.length; j++) {
					if(tabla[j] == aBorrar) {
						System.arraycopy(tabla, j+1, tabla, j, (tabla.length - 1 - j));
						tabla = Arrays.copyOf(tabla, tabla.length-1);
					}
				}
				break;
			case "c": //opción 'c' 
				System.out.println("Programa cerrado, tenga un buen día."); //Cerramos el programa
				break;
				default:  //Si la opción introducida no existe
					System.out.println("Esa opción no existe"); 
			}
		} while(!opcion.equals("c")); //El bucle correrá mientras opción != c
		
		sc.close();
	}

}
