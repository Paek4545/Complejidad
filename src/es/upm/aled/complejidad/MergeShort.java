package es.upm.aled.complejidad;

import java.util.Arrays;

public class MergeShort {
	public static int[] mergeSort(int[] list) {
	// Caso base
		if (list.length == 1) {
			return list;
		}
	// Paso recursivo
		int[] left = Arrays.copyOfRange(list, 0, list.length/2); //O(n/2) => O(n)
		int[] right = Arrays.copyOfRange(list, list.length/2, list.length); //O(n/2) => O(n)
		// Ordeno la mitad izquierda
	int[] sortedLeft = mergeSort(left); // O(log SOMETHING_N)
		// Ordeno la mitad derecha								--> O(2log SOMETHING_N) => O(log SOMETHING_N)
	int[] sortedRight = mergeSort(right); //O(log SOMETHING_N)
		// Creo el array en el que pondré las cosas ordenadas
	int[] sortedMerged = new int[list.length];
		int iMerged = 0, iLeft = 0, iRight = 0;
		while (iLeft < sortedLeft.length || iRight < sortedRight.length) {
			// Si el izquierdo se me acabó
			if (iLeft == sortedLeft.length) {
				// Cojo del array derecho
				sortedMerged[iMerged] = sortedRight[iRight];
				iRight++;
				iMerged++;
			}
			// Si el derecho se me acabó
			else if (iRight == sortedRight.length) {
				// Cojo del array izquierdo
				sortedMerged[iMerged] = sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			}
			else if (sortedLeft[iLeft] <= sortedRight[iRight]) {
				// Cojo del array izquierdo
				sortedMerged[iMerged] = sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			}
			else if (sortedLeft[iLeft] > sortedRight[iRight]) {
				// Cojo del array derecho
				sortedMerged[iMerged] = sortedRight[iRight];
				iRight++;
				iMerged++;
			}
		}
		return sortedMerged;
		}
	public static void main(String[] args) {
		int[] list = {31,29,27,25,23,21,19,17,15,13,11,9,7,5,3,1};
		int[] listBazillion = new int[100000];
		for (int i=0; i<listBazillion.length; i++) {
			listBazillion[i] = 100000-i;
		}
		long t1 = System.nanoTime();
		int[] listOrdenada = mergeSort(listBazillion);
		long t2 = System.nanoTime();
		System.out.println ("Esto tarda: " + (t2-t1));
		/*System.out.println("Ordenado: ");
		for (int v : listOrdenada) {
			System.out.println(v);
		}*/
}
	}

