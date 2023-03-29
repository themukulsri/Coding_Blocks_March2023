package Lec2;

import java.util.Scanner;

public class pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n;
		
		while(row<=n) {
			//star
			int i=1;
			int val=n;
			while(i<=star) {
				System.out.print(val+" ");
				i++;
				val--;
			}
			//next row
			row++;
			System.out.println();
		}

	}

}
