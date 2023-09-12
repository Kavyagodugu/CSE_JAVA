import java.util.Scanner;
import java.lang.Math;

class MathematicalOperations{
      public static void main(String[] args)
      {
      int a,b,c,pos;
      System.out.println("enter integers:");
      Scanner in=new Scanner(System.in);
      a=in.nextInt(); 
      b=in.nextInt();
      System.out.println("enter pos:");
      pos=in.nextInt();
      switch(pos)
      {
      case 1:
             c=a+b;
             System.out.println("addition:"+c);
             break;
      case 2:
             c=a-b;
             System.out.println("subtraction:"+c);
             break;                                               
       case 3:
             c=a*b;
             System.out.println("mutiplication:"+c);
             break;                                               
       case 4:
             c=a/b;
             System.out.println("division:"+c);
             break;                                               
       case 5:
             c=a%b;
             System.out.println("modulus:"+c);
             break;                                               
      default:
            System.out.println("unknown");
      }
      }
 }           
