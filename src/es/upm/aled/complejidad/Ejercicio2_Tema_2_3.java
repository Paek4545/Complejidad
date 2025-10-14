package es.upm.aled.complejidad;

/* 
 Un algoritmo de ordenación con una complejidad O(n log n) emplea 1 
milisegundo en ordenar 1000 elementos. Asumiendo que el tiempo (T(n)) 
necesario para ordenar n elementos es directamente proporcional a n log n, 
esto es, T(n) = cn log n. Determinar una formula para calcular N elementos 
(T(N)), y estimar cuanto tiempo puede llevar ordenar 1.000.000 elementos.
 */
public class Ejercicio2_Tema_2_3 {
	// Fórmula a determinar:
	/*
	 T(n) = c*n*log n
	 Despejamos para c: c=T(N)/N*log N
	 
	 T(n) = (T(N) / N* logN) * (n*log n) = T(N)*(n*log n)/(N * logN)
	 
	 Por tanto para T(1.000.000) = T(1.000) * [(1.000.000 * log (1.000.000)) / (1.000 * log 1.000)] =
	 T(1.000) = 1 --> T(1.000.000) = 1*2000 = 2000 ms
	 */
}
