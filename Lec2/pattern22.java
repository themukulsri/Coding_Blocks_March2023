package Lec2;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=-1;
		int row=1;
		while(row<=n) {
			int i=1;
			if(row==1)
				i=2;
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
		while(i<=star) {
			System.out.print("* ");
			i++;
		}
		star--;
		row++;
		space+=2;
		System.out.println();
		}
	}

}
