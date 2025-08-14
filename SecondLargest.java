package daily_task;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {12,34,3,43,2};
		int max=a[0];
		int sm=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				sm=max;
				max=a[i];
			}					
		}
		System.out.println(sm);		
	}
}
