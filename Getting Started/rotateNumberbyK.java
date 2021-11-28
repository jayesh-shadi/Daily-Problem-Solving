import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int nod = 0;
    int temp = n;
    while (temp > 0)
    {
      temp = temp / 10;
      nod++;
    }
    k = k % nod;
    {
      if (k < 0)
      {
        k += nod;
      }
    }
    int div = 1;
    int mul = 1;
    for (int i = 1; i <= nod; i++)
    {
      if (i <= k)
      {
        div = div * 10;
      }
      else {
        mul = mul * 10;
      }
    }
    int quo = n / div;
    int r = n % div;
    int rem = r * mul + quo;
    System.out.println(rem);
  }
}