public class sumofdigits {
    public static void main(String[] args)
    {
        int n=sumofdigits(2512);
        System.out.println(n);
    }
    static int sumofdigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
