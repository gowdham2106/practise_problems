package daily_task;

import java.util.Scanner;

public class Matrix {
	
	 
	
	static  void create(int[][] m1,int[][] m2) {
		 Scanner sc =new Scanner(System.in);
		System.out.println("enter a input for 1st matrix :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m1[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("enter a input for second matrix :");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m2[i][j]=sc.nextInt();
				
			}
			
		}
		
	}
	
	static void display(int matrix[][]) {
		for(int k=0;k<3;k++) {
			for(int m=0;m<3;m++) {
				System.out.print(matrix[k][m]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}
	static void add(int m1[][],int m2[][]) {
		int[][] addm=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				addm[i][j]=m1[i][j]+m2[i][j];
				
			}
		}
		System.out.println("result:");
		display(addm);
		
	}
	static void sub(int m1[][],int m2[][]) {
		int[][] subm=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				subm[i][j]=m1[i][j]-m2[i][j];
			}
		}
		System.out.println("subtraction");
		display(subm);
	}
	static void multi(int m1[][],int m2[][]) {
		int[][] mul=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					mul[i][j]+=m1[i][k]*m2[k][i];
				}
			}
		}
		display(mul);
	}
	
	
public static void main(String[] args) {
	int[][] matrix1 =new int[5][5];
	int[][] matrix2 =new int[5][5];
	create(matrix1,matrix2);
	display(matrix1);
	display(matrix2);
	add(matrix1,matrix2);
	sub(matrix1,matrix2);
	multi(matrix1,matrix2);
	
	

}
}

