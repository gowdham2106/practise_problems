package daily_task;

public class qyickSort {

	static int parti(int[] ar,int low,int high) {
		int pivot=ar[high];
		int i=-1;
		for(int j=0;j<high;j++) {
			if(ar[j]<=pivot) {
				i++;
				int temp=ar[j];
				ar[j]=ar[i];
				ar[i]=temp;
			}
		}
		int t=ar[i+1];
		ar[i+1]=ar[high];
		ar[high]=t;
		return i+1;
	}
	static void Quick(int[] arr,int low,int high) {
		if(low<high) {
			int piv=parti(arr,low,high);
			Quick(arr,low,piv-1);
			Quick(arr,piv+1,high);
		}
	}
	static void display(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		int[] a= {20,15,16,13};
		Quick(a,0,3);
		display(a);
	}
	

}
