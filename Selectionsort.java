package daily_task;

import java.util.Arrays;

class Selectionsort {
public static void main(String[] args) {
	int[] arr= {5,2,7,4,1,6};
	for (int i = 0; i < arr.length-1; i++) {
		int min=i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j]<arr[min]) {
				min=j;
		}
	}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
	System.out.println(Arrays.toString(arr));
}
}
