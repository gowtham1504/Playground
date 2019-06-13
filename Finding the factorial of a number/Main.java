import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	 
	  System.out.print(factorial(n));
	}
	public static int factorial( int n)
	{
      int x=n;
	  if(n == 0){
	    return 1;
	  }
	 // else if(n == 1){
	   // return x;
	  //}
	  else if(n>0)
      {
	    return n * factorial( n - 1);
	  }
      else
      {
        return 0;
      }
		}
}  
	 
