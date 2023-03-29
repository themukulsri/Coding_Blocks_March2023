package Lec2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n-1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=row) {
				System.out.print("* ");
				j++;
			}
			//next row preparation
			row++;
			star--;
			System.out.println();
		}


	}

}
