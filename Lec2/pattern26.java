package Lec2;

import java.util.Scanner;

public class pattern26 {

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
			while(j<=star) {
				System.out.print(j+" ");
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
