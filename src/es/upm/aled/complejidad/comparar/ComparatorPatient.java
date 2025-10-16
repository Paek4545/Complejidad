package es.upm.aled.complejidad.comparar;

import java.util.Comparator;

public class ComparatorPatient implements Comparator{

	@Override
	// Devuelve mayor que 0 si objeto1 es mayor que el que objeto2
		// Devuelve 0 si son iguales (en orden)
		// Devuelve menor que 0 si objeto1 es menor que objeto2
	// Ordenar por name
	public int compare(Object o1, Object o2) {
		Patient p1 = (Patient) o1;
		Patient p2 = (Patient) o2;
		return p1.getName().compareTo(p2.getName());
	}
	
}
