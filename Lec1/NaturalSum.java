package Lec1;

public class NaturalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,sum=0,i=1;
		/*for(int i=1;i<=n;i++) {
				sum=sum+i;
		}
		System.out.println(sum);*/
		while(i<=n) {
			sum=sum+i;
			i+=1;
		}
		System.out.println(sum);
	}

}
