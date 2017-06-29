import java.util.Scanner;


public class SumOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0){
			int temp=n;
			while(temp>0){
				sum=sum+temp%10;
				temp=temp/10;
			}n=n/10;
		}System.out.println(sum);
}
}
