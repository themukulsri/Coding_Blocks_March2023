package Lec2;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n/2+1;
		int space=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
			System.out.print("* ");
			i++;
			}
			int j=1;
			while(j<=space) {
				if(row==1||row==n) {
					System.out.print("* ");
				}
				else
			System.out.print("  ");
			j++;
			}
			i=1;
			while(i<=star) {
			System.out.print("* ");
			i++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			System.out.println();
			row++;
		}

	}

}
