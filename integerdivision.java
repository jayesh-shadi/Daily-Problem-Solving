public class integerdivision {
    static int div(int a,int b)
    {
        int count=0;
        int sum=b;
        while(sum<=a)
        {
            sum+=b;
            count++;
        }
        return b;
    }
public static void main(String[] args) {
        int c=div(10, 5);
        System.out.println(c);
    }
}
