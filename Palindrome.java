import java.util.Scanner;
class Palindrome{
      public static void main(String[] args)
      {
      int a,rem,copy,sum;
      copy=0;
      System.out.println("enter number:");
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      sum=a;
      while(a!=0)
      {
      rem=a%10;
      copy=copy*10+rem;
      a=a/10;
      }
     if(copy==sum)
     System.out.println("palindrome number");
     else
     System.out.println("not a palindrome number");
     }
}    
      
      
      
