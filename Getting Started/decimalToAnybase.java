import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int ansnum=0,multiplier=1;
       while(n>0)
       {
           int rem=n%b;
           n=n/b;
           ansnum=ansnum+rem*multiplier;
           multiplier*=10;
       }
       return ansnum;
   }
  }