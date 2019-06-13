import java.util.Scanner;
class Main{
  public static int greater(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
    
  }
	public static void main (String[] args)
    {
      
	 Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int res=greater(n1,n2);
      if(n3>n1 || n3>n2)
        System.out.println(n3);
      else if(n1>n3&&n1>n2)
        System.out.println(n1);
      else if(n2>n3&&n2>n1)
        System.out.println(n2);
	}
}