package es.upm.aled.complejidad;

public class LinearSearch {

	// Hemos implementado indexOf()
	// Devuelve la posición, -1 si no está
public static int linearSearch(int[] lista, int valor) {
	// Recorro la lista
	for (int i = 0; i < lista.length; i++) {
		// ¿Son iguales?
		if (lista[i] == valor) {
			return i;
		}
	}
	// No estaba
	return -1;

 }

// Mediante recursividad:
public static int linearSearch2(int[] lista, int valor, int index) {
	// Caso base: si llegamos hasta el final sin encontrarlo
		if (index == lista.length) {
			return -1;
		}
		// Código general -> Si encontramos el valor
	if (lista[index] == valor) {
		return index;
	}
	// Paso recursivo: buscamos en el resto del array
	return linearSearch2(lista, valor, index+1);
}	
public static void main(String[] args) {
	int[] arr = {10,20,30,40,50};
	System.out.println("Buscamos la posición del número 30 del array: " + linearSearch(arr, 30));
	System.out.println("Buscamos la posición del número 20 del array: " + linearSearch2(arr, 20, 0));
}
	}

