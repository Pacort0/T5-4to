package ejercicios;

import java.util.Arrays;

public class Ejercicio02{
	public static void main(String[] args) {
		//Creamos la tabla
				int tabla[] = new int[20];
				int cont = 0;
				
				for(int i = 0; i < tabla.length; i++) {
					tabla[i] = (int)(Math.random()*100);
				}
				
				System.out.println("Tabla original: " + Arrays.toString(tabla));
				
				while(cont < tabla.length) {
					if(esPrimo(tabla[cont])) {
						System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - cont -1));
						tabla = Arrays.copyOf(tabla, tabla.length-1);
					}
					else {
						cont++;
					}
				}
				System.out.println("Tabla sin impares: " + Arrays.toString(tabla));
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