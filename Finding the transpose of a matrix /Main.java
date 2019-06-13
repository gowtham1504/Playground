import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
  int rowsize=sc.nextInt();
  int colsize=sc.nextInt();
  int matrix[][]=new int[rowsize][colsize];
  
  
  int i;
  int j;
  for( i=0;i<=rowsize-1;i++)
  {
    for( j=0;j<=colsize-1;j++)
    {
      matrix[i][j]=sc.nextInt();
    }
    }
  
  for( i = 0; i < rowsize; i++)
  {
      for( j = 0; j <= colsize -1; j++)
      {
         
  System.out.print(matrix[j][i]+" ");
}
   System.out.println(); 
  }
  }
}
      
  
    
  