import java.io.*;
import java.util.*;

class Main
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int val=1;
  
	for(int i=1;i<=n;i++)
	{
	for(int sp=1;sp<=(n-i);sp++)
	{
	System.out.print(" ");
    
	
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print(val+" ");
      val++;
	}
      System.out.print("\n");
		}
	

	}
	}