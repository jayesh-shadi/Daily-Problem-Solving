//We divide the given number by the smallest number and keep on dividing till it no longer could be divided by that number.

//As soon as that happens, we check the divisibility of the current state of the given number with the next greater number as the divisor and continue this process until the given number becomes 1.

//Basically, "We are dividing the number till it could be divided (Decomposing the number into smaller numbers)".

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int div=2;div*div<=n;div++)
  {
      while(n%div==0)
      {
          System.out.print(div+" ");
          n=n/div;
      }
  }
  if(n!=1)
  {
      System.out.print(n);
  }
 }
}