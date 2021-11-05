import java.util.Scanner;
class HackerRank1{
	public float sum(int i,int n, float s){
		if(i>n)
			return s;
		else{ 
			if(i%2==0)
				s-=(float)1/i;
			else
				s+=(float)1/i;
			return sum(i+1,n,s);
		}	
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		HackerRank1 obj = new HackerRank1();
		int n=scan.nextInt();
		System.out.printf("%05f",obj.sum(1,n,0));
	}
}