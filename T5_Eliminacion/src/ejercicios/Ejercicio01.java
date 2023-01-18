package ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos la tabla
		int tabla[] = new int[20];
		int cont = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
		}
		
		System.out.println("Tabla original: " + Arrays.toString(tabla));
		
		while(cont < tabla.length) {
			if(impar(tabla[cont])) {
				System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - cont -1));
				tabla = Arrays.copyOf(tabla, tabla.length-1);
			}
			else {
				cont++;
			}
		}
		System.out.println("Tabla sin impares: " + Arrays.toString(tabla));
	}

	//Función para separar los números según su signo
	public static boolean impar(int num) {
		boolean impar = true;
		//Si es divisible entre dos es par --> impar == false
		if(num % 2 == 0) {
			impar = false;
		}
		
		return impar;
	}
}
