package Lec2;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n;
		while(row<=n) {
			//star
			int i=1;
			while(i<=n) {
				if(i==row||i==star)
				System.out.print("* ");
				else
					System.out.print("  ");
				i++;
			}
			//next row
			row++;
			star--;
			System.out.println();
		}

	}

}
