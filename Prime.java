import java.util.Scanner;
class Prime{
      public static void main(String[] args)
      {
      int a,i,c;
      
      System.out.println("enter number:");
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      for(i=a;i>1;i--)
      {
      if(a%i==0)
      {
      int count=0;
      for(c=2;c<i;c++)
      {
      if(i%c==0)
      count +=1;
      }
      
      if(count==0)
      System.out.println("prime factor:"+i);
      }
      }
      }
 }     
      

