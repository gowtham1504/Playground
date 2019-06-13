import java.util.Scanner;
public class Main
{
    public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      
      for(int i=0;i<=(arr_size-1);i++)
      {
        for(int j=i+1;j<=(arr_size-1);j++)
        {
          int res=arr[i]+arr[j];
          if(res==value)
          {
            System.out.print(arr[i]);
            System.out.print(",");
            System.out.print(" ");
            System.out.println(arr[j]);
          }
        }
      }
    }
}
      