package Lec2;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				if(row==1||row==star||i==1||i==star)
				System.out.print("* ");
				else
					System.out.print("  ");
				i++;
			}
			//next row
			row++;
			System.out.println();
		}


	}

}
