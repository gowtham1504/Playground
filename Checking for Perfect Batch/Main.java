import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      int count1=0;
      int count2=0;
      for( int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int sum1=0;
      int sum2=0;
      for( int i=0;i<=arr_size-1;i++)
      {
        sum1=sum1+arr[i];
        count1++;
        if(count1==3)
        {
          break;}
      }
      for( int i=0;i<=arr_size-1;i++)
      {
        sum2=sum2+arr[i];
        count2++;
        if(count2==6)
        {
          break;}
      }
      int res=sum2-sum1;
      if(res==sum1)
      
        System.out.println("Perfect Batch");
      else 
        System.out.println("Not a Perfect Batch");
    }
}
      