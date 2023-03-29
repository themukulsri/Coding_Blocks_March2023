package Lec2;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space1=n/2;
		int space2=-1;
		while(row<=n) {
			int i=1;
			while(i<=space1) {
			System.out.print("  ");
			i++;
			}
			int j=1;
			while(j<=star) {
			System.out.print("* ");
			j++;
			}
			i=1;
			while(i<=space2) {
			System.out.print("  ");
			i++;
			}
			j=1;
			if(row==1||row==n) {
				j=2;
			}
			while(j<=star) {
			System.out.print("* ");
			j++;
			}
			if(row<=n/2) {
				//star+=2;
				space1--;
				space2+=2;
			}
			else {
				//star-=2;
				space1++;
				space2-=2;
			}
			System.out.println();
			row++;
		}


	}

}
