package Lec2;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n;
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
			//next row
			row++;
			star--;
			space++;
			System.out.println();
		}


	}

}
