import java.util.Scanner;
class Main
{
	
	    public static int sum(int s)
     {
      int sum1=0;
          for(int i=0;i<=s;i++)
          {
             sum1=sum1+i;
          }
    return sum1;
     }
  
	public static void main (String[] args)
    {
	 
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int some=sum(n);
       n=some;
       System.out.println(n);
       
	} 
}
	