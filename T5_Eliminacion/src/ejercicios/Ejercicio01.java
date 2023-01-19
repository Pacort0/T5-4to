package ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Creamos la tabla
		int tabla[] = new int[20];
		int cont = 0; //Creamos el contador que usaremos en el while
		
		//Rellenamos la tabla con números aleatorios
		for(int i = 0; i < tabla.length; i++) { 
			tabla[i] = (int)(Math.random()*100);
		}
		
		//Mostramos la tabla original
		System.out.println("Tabla original: " + Arrays.toString(tabla));
		
		//Mientras el contador no supere la longitud de la tabla no saldremos del bucle
		while(cont < tabla.length) {
			if(impar(tabla[cont])) { //Llamamos a la función 'impar' y, si tabla[i] es impar:
				System.arraycopy(tabla, cont+1, tabla, cont, (tabla.length - cont -1));//copiamos los elementos a la derecha de la tabla y lo pegamos todo a partir de 'cont'
				tabla = Arrays.copyOf(tabla, tabla.length-1);//Para quitar el 0 del final de la tabla, la copiamos en otra de tamaño menor
			}
			else {
				cont++; //Si el número es par, aumentamos el contador
			}
		}
		System.out.println("Tabla sin impares: " + Arrays.toString(tabla)); //Imprimimos la tabla sin impares
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
