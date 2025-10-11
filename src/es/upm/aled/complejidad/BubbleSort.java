package es.upm.aled.complejidad;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {14,29,10,7,30,80,23,45,50,2,3,100,53};
		bubbleSort(array);
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
