package Lec2;

import java.util.Scanner;

public class pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row = 1;
		int star=1;
		int space=n-1;
		//int sum=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=space) {
				System.out.printf("  ");
				i++;
			}
			int j=1;
			int k=row;
			while(j<=star) {
				if(j==1||j==star)
				System.out.print(k+" ");
				else
					System.out.print(0+" ");
				if(j<=star/2) {
					k++;
				}
				else {
					k--;
				}
				//sum++;
				j++;
			}
			//next row preparation
			row++;
			star+=2;
			space--;
			System.out.println();
		}

	}

}
