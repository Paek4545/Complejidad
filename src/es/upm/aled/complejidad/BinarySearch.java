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
	 // Código general
		int me = (int) Math.floor(lo + (hi-lo)/2); // rango válido mientras que lo <= hi
		int v = list[me];	
	 // Caso base (2 casos base)
		
		if (lo>hi) {
			return -1;
		} else if (v == value) {
			return me;
		}
	 // Paso recursivo
		if (v > value) {
			return binarySearch(list, lo, me, value); // Como el intervalo va entre [...) no hace falta el -1 (gracias a Math.floor)
		} else {
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
