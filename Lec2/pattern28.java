package Lec2;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=1;
		int space=n-1;
		//int sum=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=space) {
				System.out.printf("  ");
				i++;
			}
			int j=1;
			int k=row;
			while(j<=star) {
				System.out.print(k+" ");
				if(j<=star/2) {
					k++;
				}
				else {
					k--;
				}
				//sum++;
				j++;
			}
			//next row preparation
			row++;
			star+=2;
			space--;
			System.out.println();
		}


	}

}
