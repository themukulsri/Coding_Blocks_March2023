package Lec2;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=n;
		int space=n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<=n-1) {
				space-=1;
				star--;
			}
			else {
				space+=1;
				star++;
			}
			//next row
			row++;
			//space+=2;
			System.out.println();
		}

	}

}
