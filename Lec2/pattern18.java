package Lec2;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n/2;
		while(row<=n) {
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
			i=1;
			while(i<=space) {
			System.out.print("  ");
			i++;
			}
			if(row<=n/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
			row++;
		}

	}

}
