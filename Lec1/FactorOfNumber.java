package Lec1;

public class FactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=30,i=2;
		while(i<=N/2) {
			if(N%i==0)
				System.out.println(i);
			i=i+1;
		}
	}

}
