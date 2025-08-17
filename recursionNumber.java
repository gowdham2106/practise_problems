package daily_task;

public class recursionNumber {
public static void main(String[] args) {
	int i=10;
	nu(i);
	
}
static int nu(int i) {
	if(i==0) {
		return 0;
	}
	
	i--;
	nu(i);
	System.out.println(i+1);
	return i;
	
	
	
}
}
