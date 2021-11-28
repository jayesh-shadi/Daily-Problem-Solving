import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int max=a;
    if(b>=max)
    {
        b=max;
    }
    if(c>=max)
    {
        max=c;
    }
    if(max==a)
    {
        System.out.println((b*b+c*c)==a*a);
    }
    else if(max==b)
    {
        System.out.println((a*a+c*c)==b*b);
    }
    else
    {
        System.out.println((b*b+a*a)==c*c);
    }
   }
  }