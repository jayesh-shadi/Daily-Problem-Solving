public class sqrt {
    public static void main(String[] args) {
        int n=sqrt1(20);
        System.out.print(n);
    }
    public static int sqrt1(int n)
    {
        for(int guess=1;guess*guess<=n;guess++)
        {
            if(guess*guess==n){
                return guess;
            }
          
        }
        return -1;
    }
}
