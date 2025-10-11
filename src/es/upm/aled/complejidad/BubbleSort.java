package es.upm.aled.complejidad;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// Nos creamos una lista de elementos desordenados en un array
		int[] array = {14,29,10,7,30,80,23,45,50,2,3,100,53, 77};
		// Le pasamos al método el array que nos acabamos de crear
		bubbleSort(array);
	}
	
	public static void bubbleSort(int[] arr) {
		// Primer bucle externo que mirará todos los elementos del array
		for (int i = 0; i<arr.length; i++) {
		// Segundo bucle interno dentro del primer bucle donde en cada elemento se compara con los demás elementos
		// del array, es decir, primero se coge el 14 y este se compara con todos los elementos del array restantes
		// y así todo el rato.
			for (int j = 0; j<arr.length - i -1; j++) {
		// Si la posición de array anterior es MAYOR que el de la siguiente posición, por ejemplo en el caso del
		// elemento 3 (10) y elemento 4 (7)
				if(arr[j] > arr[j+1]) {
		// Nos creamos una variable auxiliar para guardar la posición del elemento anterior
					int temp = arr[j];
		// Actualizamos la posición de tal forma que la posición anterior se "mueve" a la siguiente posición
					arr[j] = arr[j+1];
		// Por otro lado, movemos la posición siguiente a la posición anterior usando la variable auxiliar para ello
					arr[j+1] = temp;
				}
			}
		}
		// Imprimos el array para que lo podamos ver en forma de String
		System.out.println(Arrays.toString(arr));
	}
}
