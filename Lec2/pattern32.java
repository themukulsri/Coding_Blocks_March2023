package Lec2;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int p=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=p) {
				if(i%2!=0)
				System.out.print(row+" ");
				else
					System.out.print("* ");
				i++;
			}
			if(row<=n-1)
			p+=2;
			else
				p-=2;
			row++;
			System.out.println();
		}

	}

}
