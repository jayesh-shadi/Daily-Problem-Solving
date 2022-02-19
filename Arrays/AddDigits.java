// sum of digits until one for eg:- 99 so 9+9=18 and 1+8=9
// for 101 1+0+1=2


class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        else if(num%9==0) return 9;     
        else return num%9;
        
    }
}