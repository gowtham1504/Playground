import java.util.Scanner;
public class Main{
	
	   public static int GCD(int n1,int n2)
       {
         int gcd=0,min_ele;
         if(n1<n2)
         {
           min_ele=n1;
         }
         else
         {
           min_ele=n2;
         }
         while(min_ele>=1)
         {
           if((n1%min_ele==0)&&(n1%min_ele==0))
           {
             gcd=min_ele;
             break;
           }
           min_ele--;
       }
         return gcd;
      
	}
public static void main (String[] args)
	{
Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  int n3=sc.nextInt();
  int res1=GCD(n1,n2);
  int res2=GCD(res1,n3);
  System.out.println(res2);
	}
}

