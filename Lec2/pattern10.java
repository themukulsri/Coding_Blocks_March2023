package Lec2;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=2*n-1;
		int space=0;
		while(row<=n) {
			//star
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//next row preparation
			row++;
			star-=2;
			space++;
			System.out.println();
		}

	}

}
