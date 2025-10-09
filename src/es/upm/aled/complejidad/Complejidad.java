package es.upm.aled.complejidad;

public class Complejidad {
// Si el array mide 100
		// O(n-1+1+1) => O(n)
	// Devolver la suma de todos los enteros de un array
	public static int sumIntArray(int[] lista) {
		int sum = 0;
		// Esto se ejecuta tantas veces como el tamaño del array - 1
		// Esto se ejecuta 100 veces
		for (int i =0; i< lista.length; i++) {
			sum += lista[i];
		}
		return sum;
	}
	// Devuelve la suma de todos los enteros de un array 2 veces
	// O(n-1+n-1+1+1) => O(2n) => O(n)
	public static int sumIntArrayTwice(int[] lista) {
		int sum = 0;
		// Esto se ejecuta tantas veces como el tamaño del array - 1
		// Esto se ejecuta 100 veces
				for (int i =0; i< lista.length; i++) {
					sum += lista[i];
				}
		// Esto se ejecuta tantas veces como el tamaño del array - 1
		// Esto se ejecuta 100 veces
		for (int j =0; j< lista.length; j++) {
			sum += lista[j];
		}
		return sum;
		// Se ha sumado 200 veces
	}
		// Si el array mide 100 y el 69 se encuentra en la posición 13, se ejecuta 13 veces
	// Caso peor --> 69 está en la posición N
	public static int sumIntArrayStop69(int[] lista) {
		int sum = 0;
		// Esto se ejecuta tantas veces como el tamaño del array - la posición de 69
		// Camino crítico --> For
		for (int i =0; i< lista.length; i++) {
		// Si el número 69 se encuentra en la posición de un array, se para el código (devuelve la suma de la posición i)
			if (lista[i] == 69) {
				return sum;
			}
			sum += lista[i];
		}
		return sum;
	}
	// Si se encuentra un duplicado, aumenta en 1
	// O(n*n+1+1) = O(n^2)
	public static int numDuplicates(int[] lista) {
		int numDupl = 0;
		for (int i =0; i< lista.length; i++) {
			for (int j = 0; j < lista.length; j++) { // Para cada elemento hago una comparación con todos los demás elementos del array
				// Si tengo 100 elementos, para cada elemento se ejecuta 100 veces, es decir 100 * 100 = 10.000
				// Esto se ejecuta tantas veces como (tamaño de array)^2 
				if ((i<j) && (lista[i] == lista[j])) {
					numDupl++;  
				}
			}
		}
		return numDupl;
		
	}
	// O(6+n^3) => O(n^3)
	public static int[][] multiplyMatrix(int A[][], int B[][]){
	int rows1 = A.length;
	int rows2 = B.length;
	int cols1 = A[0].length;
	int cols2 = B[0].length;
	List<Integer> miLista = new ArrayList<Integer>();
	
	
	int C[][] = new int[rows1][cols2];
	
	
	// Asumimos que rows1 = rows2 = cols1 = cols2 = n
	for (int i = 0; i < rows1; i++) {
		for (int j = 0; j < cols2; j++) {
			for (int k = 0; k < cols1; k++) {
				// Esto va a pasar rows1 * cols2 * cols1 veces
				// Estp va a pasar n^3 veces
				C[i][j] += A[i][k] * B[k][j];
				miLista.contains(7); // Suma N a la complejidad
			}
		}
	}
	return C;
	}
}
