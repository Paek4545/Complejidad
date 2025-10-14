package es.upm.aled.complejidad;

// Ejercicio 1 
//Estimar el orden de complejidad de los siguientes algoritmos, en función de 
//N: 
public class Ejercicio1_Tema_2_3 {
	/*int sum = 0; 
	for (int n = N; n > 0; n /= 2) --> Se ejecuta mientras n se reduzca a la mitad cada vez --> logN
	for (int i = 0; i < n; i++)  --> N iteraciones 
	sum++; */ 
	/*T(n)=T(n/2)+n=T(n/4)+n/2+n 
			T(n)=T(n/2^k)+n+n/2+n/4+...+ n/2^k --> Forma general
			Para n/2^k=1 T(n)=T(1)+n+n/2+n/4+...+1=O(n) 
			T(1)=1 */
	// Orden de complejidad: = O(2N) => O(N)
	
	/* int sum = 0; -->Bucle anidado, no es recursivo
	for (int i = 1; i < N; i *= 2) --> Toma valores de 1,2,4,8, ..., hasta cerca de N --> logN
	for(int j = 0; j < i; j++) --> va de j=0 a j=i-1
	sum++; */
	// Serie geométrica --> 1+2+4+8+⋯+N/2
	// Orden de complejidad: O(2N-1) => O(N)--> Caso análogo que el anterior
	
	/*int sum = 0; 
	for (int i = 1; i < N; i *= 2) --> Toma valores de 1,2,4,8, ..., hasta cerca de N --> logN
	for (int j = 0; j < N; j++) --> se ejecuta N veces --> N
	sum++;
	
	Recurrencia:
	Bucle externo = log n
	Bucle interno = n+n+n+...+n
	// Orden de complejidad: O(n*log n)
	 * 
	 * Por tanto la peor opción sería la 1c, con un orden de complejidad de O(N*logN)
	 * Por otro lado, la mejor es 1b, pero la complejidad es como la de 1a
	*/
	
}
