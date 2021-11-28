//Approach
//There exists a relation between LCM and GCD [gcd*lcm=n1*n2] This could be further modified into: [lcm= (n1*n2)/gcd]
//we make use of the two given numbers by selecting one to be a dividend and the other to be a divisor and perform division. If we get the remainder in the first division (i.e the dividend is not evenly divided by the divisor), we select the remainder to be the next divisor and the previous divisor to be the next dividend and then keep on performing till we find a number which evenly divides the dividend.The first number that performs even division (give remainder 0), is our required gcd.

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int temp1=num1;
      int temp2=num2;
      while(num1%num2!=0)
      {
          int rem=num1%num2;
          num1=num2;
          num2=rem;
      }
      int gcd=num2;
      int lcm=(temp1*temp2)/gcd;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }