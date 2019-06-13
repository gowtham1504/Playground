import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=n;
      int k=n;
      int first=(m%1000)/100;
      while(k>=100)
      {
        k=k/10;
      }
      int second=k%10;
    
      int last=n%10;
      int fact1=1;
      for(int i=1;i<=first;i++)
      {
       fact1=fact1*i;   
      }
  int fact2=1;
      for(int i=1;i<=second;i++)
      {
       fact2=fact2*i;   
      }
  int fact3=1;
      for(int i=1;i<=last;i++)
      {
       fact3=fact3*i;   
      }
  int sum=fact1+fact2+fact3;
  if(sum==n)
  {
    System.out.print("Yes");
  }
  else
  { 
      System.out.println("No");
	}
}
}