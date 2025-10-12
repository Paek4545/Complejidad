package es.upm.aled.complejidad;

public class BinarySearch {
	
	private static int binarySearch(int[] list, int lo, int hi, int value) {
		// Deberes: ¿Implementarlo con recursividad?
	/*	do {
			int me = (int) Math.floor(lo + (hi-lo)/2);
			int v = list[me]; // O(1) --> Acceder la posición del array
			if (v == value) {
				return me;
			} 
			else if (v>value) {
				hi = me;
			}
			else {
				lo = me +1;
			}
		} while(lo<hi);
		return -1;
	} */
	 // Código general (igual que en el primer caso)
		int me = (int) Math.floor(lo + (hi-lo)/2); // Búsqueda válida mientras que lo <= hi
		// Obtenemos el valor en la posción media del array
		int v = list[me];	
	 // Caso base (2 casos base)
		// Primer caso base: comprobamos si NO se cumple la condición de que hi <= lo, si no lo cumple
		// significa que el elemento buscado no se encuentra en el array, por lo que devolvemos -1
		if (lo>hi) {
			return -1;
		// Segundo caso base: comprobamos si el elemento de la lista es igual al valor buscado, si lo es, devolvemos
		// el valor medio de hi y lo (que sería el valor que estamos buscando)
		} else if (v == value) {
			return me;
		}
	 // Paso recursivo
		// Comprobamos si la valor de la posición de la posisción de la lista es mayor que el valor buscado, 
		// si lo es:
		if (v > value) {
		// Nos encontramos en el intervalo [lo, me), donde usando el método recursivo seguimos buscando el valor 
			return binarySearch(list, lo, me, value); // Como el intervalo va entre [...) no hace falta el -1 (gracias a Math.floor)
		} else {
		// En caso de que el valor de la posición de la lista se encuentre por debajo, el método pone el intervalo
		// entre el valor medio y hi, todo el rato mientras se cumpla la condición
			return binarySearch(list, me+1, hi, value);
		}
	}
	
	// Método fachada (facade)
	public static int binarySearch(int[] list, int value) {
		return binarySearch(list, 0, list.length, value);
	}
	public static void main(String[] args) {
		// Array ORDENADO, sino no funciona
		int[] list = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
		int value = 19;
		int posicion = binarySearch(list, value);
		System.out.println("Posición: " + posicion);
	}
}
