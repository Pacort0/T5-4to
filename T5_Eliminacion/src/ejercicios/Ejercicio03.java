package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos la tabla y le damos un tamaño
		int tabla[] = new int[10];
		int aBorrar; //Variable para guardar los números a borrar
		String opcion; //Variable para guardar la opción elegida del menú
		
		Scanner sc = new Scanner(System.in); //Escáner del programa
		
		for(int i = 0; i < tabla.length; i++) { //Rellenamos la tabla con valores aleatorios
			tabla[i] = (int)(Math.random()*10);
		}
		
		//Se imprime al menos una vez
		do {	
			//Menú del programa
			System.out.println("ELIJA UNA OPCIÓN: \n"
					+ "A) Mostrar valores\n"
					+ "B) Eliminar valor\n"
					+ "C) Salir");
				opcion = sc.next(); //Guardamos la elección en 'opcion'
			//Según la opción introducida
			switch(opcion) {
			case "a": //opción 'a'
				System.out.println(Arrays.toString(tabla)); //Mostramos la tabla
				break;
			case "b": //opción 'b'
				System.out.print("Introduzca el valor que desea eliminar: ");
				aBorrar = sc.nextInt(); //Guardamos el valor a eliminar en 'aBorrar'
				for(int j = 0; j < tabla.length; j++) { //Buscamos el valor a borrar
					if(tabla[j] == aBorrar) { //Una vez encontrado:
						System.arraycopy(tabla, j+1, tabla, j, (tabla.length - 1 - j)); //Machacamos el número elegido
						tabla = Arrays.copyOf(tabla, tabla.length-1); //Para deshacernos del 0 al final de la tabla
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
		
		sc.close(); //Cerramos el escáner
	}

}
