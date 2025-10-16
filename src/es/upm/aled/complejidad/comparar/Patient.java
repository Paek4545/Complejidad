package es.upm.aled.complejidad.comparar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Patient implements Comparable {
	
	private String name;
	private int ssn;
	
	public String getName() {
		return name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public Patient(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", ssn=" + ssn + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, ssn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(name, other.name) && ssn == other.ssn;
	}
	@Override
	// Devuelve mayor que 0 si ESTE (this) objeto es mayor que el que me pasan
	// Devuelve 0 si son iguales (en orden)
	// Devuelve menor que 0 si ESTE (this) objeto es menor que el me pasan
	public int compareTo(Object obj) {
		Patient otroPaciente = (Patient) obj;
		return this.ssn - otroPaciente.getSsn();
	}
	
	public static void main(String[] args) {
		Patient a = new Patient("Ana", 999);
		Patient b = new Patient("Wenceslao", 111);
		Patient[] lista1 = {a, b};
		System.out.println(Arrays.toString(lista1));
		// Ordenación
		Arrays.sort(lista1);
		System.out.println(Arrays.toString(lista1));
		System.out.println("Lista 1: " + lista1[0] + ", " + lista1[1]);
		
		Comparator comp = new ComparatorPatient();
		Arrays.sort(lista1, comp);
		System.out.println("Lista 1: " + lista1[0] + ", " + lista1[1]);
		
	}
}