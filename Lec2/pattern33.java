package Lec2;

import java.util.Scanner;

public class pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=1;
		int st;
		int space=n-1;
		while(row<=n) {
			//star
			st=n+1-row;
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(st==n)
					System.out.print(0+" ");
				else
				System.out.print(st+" ");
				if(j<=star/2) {
					st++;
				}
				else {
					st--;
				}
				j++;
			}
			//next row preparation
			row++;
			star+=2;
			//st--;
			space--;
			System.out.println();
		}


	}

}
