package Lec2;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=2*n-3;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
		int j=1;
		while(j<=space) {
			System.out.print("  ");
			j++;
		}
		i=1;
		if(row==n)
			i=2;
		while(i<=star) {
			System.out.print("* ");
			i++;
		}
		star++;
		row++;
		space-=2;
		System.out.println();
		}

	}

}
