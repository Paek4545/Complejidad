package es.upm.aled.complejidad;

import java.util.Arrays;

/*
	 * 	Si el array que se pasa como parámetro es: 
	{1.0,3.0,7.0,8.0,11.0,16.0,21.0,25.0} cuantas veces se ejecuta el cuerpo del 
	while si el número buscado es 3.0. 
	 // Número de veces que se ejecuta el while hasta encontrar 3.0: 2
	 
	 
	Si el orden del array fuese descendente, ¿como deberíamos cambiar el 
	método?
	En un array descendente, las comparaciones se invierten, porque los valores grandes están al principio
	SImplemente tendremos que cambiar en la parte del código else if (list[middle] < item) por if (list[middle] > item)
	 */
public class Ejercicio1_Tema_2_4 {
	
	public static void main(String[] args) {
		double[] arr = {1.0,3.0,7.0,8.0,11.0,16.0,21.0,25.0};
		System.out.println(Arrays.toString(arr));
	}
	/*Utilizamos la siguiente función para buscar un real en un array de números 
	reales: 
	 */
 public static int binSearch (double[] list, double item) { 
	  
	   int bottom = 0; 
   int top = list.length - 1; 
	   int middle; 
	   boolean found = false; 
	   int location = -1; 
	  
	   while (bottom <= top && !found) { 
	  
	     middle = (bottom + top) / 2; 
	  
	     if(list[middle] == item) { 
	       found = true; 
	       location = middle; 
	     } else if (list[middle] < item) { // Cambiar esta línea por else if (list[middle] > item)
	       bottom = middle + 1; 
	     } else { 
	       top = middle - 1; 
	     } 
	   } 
	   return location; 
	 } 
	 
}
