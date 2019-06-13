import java.util.Scanner;
class Main
{
  public static int square(int s)
     {
      int sqr=s*s; 
    return sqr;
     }
	public static void main (String[] args)
    {
	 
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int some=square(n);
      n=some;
       System.out.println(n);
       
	} 
}