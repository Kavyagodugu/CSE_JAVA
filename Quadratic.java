import java.util.Scanner;
import java.lang.Math;
class Quadratic{
      public static void main(String[] args)
      {
        double a,b,c;
        double x,y,z;
        double j;
         System.out.println("enter an integers:");
        Scanner in= new Scanner(System.in);
       
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        x=(b*b)-4*a*c;
        
        if(x<0)
        {
        System.out.println("imaginary roots");
        System.out.println("roots are:"+(-b/(2*a))+"+i"+(Math.sqrt(-1*x)/(2*a)));
        System.out.println("roots are:"+(-b/(2*a))+"-i"+(Math.sqrt(-1*x)/(2*a)));
        
        }
        else if(x>0)
        {
        System.out.println("real roots");
        y=(-b+Math.sqrt(x))/2*a;
        z=(-b-Math.sqrt(x))/2*a;
        System.out.println(y);
        System.out.println(z);
        }
        else
        {
        System.out.println("real and equal roots");
        y=-b/2*a;
        System.out.println(y);
        System.out.println(y);
        }
        }
 }       
        
        
        
        
        
        
        
