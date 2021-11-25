import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthToggleButtonUI;

//You are climbing a staircase. It takes n steps to reach the top.

//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Time complexity o(n) space complexity o(1)
class solution{
    public static int climbingstairs(int n)
    {
            if(n<=1)
            return n;

            int prev1=1;
            int prev2=2;
            for(int i=3;i<n;i++)
            {
                int newvalue=prev1+prev2;
                prev1=prev2;
                prev2=newvalue;
            }
            return prev2;
    }

    public static void main(String[] args)
    {
       int n= climbingstairs(5);
       System.out.println(n);

    }
}