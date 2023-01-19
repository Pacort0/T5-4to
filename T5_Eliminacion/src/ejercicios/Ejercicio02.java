package ejercicios;

import java.util.Arrays;

public class Ejercicio02{
	public static void main(String[] args) {
		//Creamos la tabla
				int tabla[] = new int[20];
				int cont = 0; //Creamos un contador para usar en el while
				
				//Rellenamos la tabla con números aleatorios
				for(int i = 0; i < tabla.length; i++) {
					tabla[i] = (int)(Math.random()*100);
				}
				
				//Mostramos la tabla original
				System.out.println("Tabla original: " + Arrays.toString(tabla));
				
				//Mientras el contador no sea mayor que la longitud de la tabla, seguirá el while
				while(cont < tabla.length) {
					if(esPrimo(tabla[cont])) { //Llamamos a la función esPrimo y, si tabla[num] es primo:
						System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - cont -1)); //copiamos los elementos a la derecha de la tabla y lo pegamos todo a partir de 'cont'
 						tabla = Arrays.copyOf(tabla, tabla.length-1);//Para quitar el 0 del final de la tabla, la copiamos en otra de tamaño menor
					}
					else {
						cont++; //Si no es primo, aumentamos el valor del contador
					}
				}
				System.out.println("Tabla sin impares: " + Arrays.toString(tabla)); //Mostramos la tabla resultante
	}
	//Función para detectar los números primos de la tabla,
		//recibe por parámetro un número entero y devuelve un booleano
		public static boolean esPrimo(int num) { 
			boolean primo = true;
			
			for(int i = num - 1; i > 1; i--){
				if(num % i == 0) {
					primo = false;
				}
			}
			
			return primo;
		}
}