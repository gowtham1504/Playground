import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
int y=n;
      
      while(n/10!=0)
      {
        n=n/10;
      }
      int m=n;
      
      y=y%10;
      
      int sum=n+y;
      System.out.println(sum);
	}
}