import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
  int rowsize=sc.nextInt();
  int colsize=sc.nextInt();
  int matrix1[][]=new int[rowsize][colsize];
  int matrix2[][]=new int[rowsize][colsize];
  int matrix3[][]=new int[rowsize][colsize];
  
  int i;
  int j;
  for( i=0;i<=rowsize-1;i++)
  {
    for( j=0;j<=colsize-1;j++)
    {
      matrix1[i][j]=sc.nextInt();
    }
    }
  for( i=0;i<=rowsize-1;i++)
  {
    for( j=0;j<=colsize-1;j++)
    {
      matrix2[i][j]=sc.nextInt();
    }
    }
  
  for( i = 0; i <= rowsize-1; i++)
  {
      for( j = 0; j <= colsize - 1; j++)
      {
        matrix3[i][j]= matrix1[i][j]-matrix2[i][j];
  System.out.print(matrix3[i][j]+" ");
}
   System.out.println(); 
  }
  }
}
      
  
    
  