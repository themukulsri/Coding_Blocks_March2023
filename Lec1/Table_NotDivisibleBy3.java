package Lec1;

import java.util.Scanner;

public class Table_NotDivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n=7,i=1,p;
		while(i<=n) {
			p=n*i;
			if(p%3!=0)
				System.out.println(p);
			i+=1;
		} */
		
		int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
        int i=1;
        while(i<=y){
            System.out.println(x*i);
            i=i+1;
        }
	}

}
