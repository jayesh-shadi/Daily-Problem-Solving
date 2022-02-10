
/*
The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result. */

class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        if(len==0) return 0;
        int index=0;
        while(index<len && s.charAt(index)==' ') {++index;}
        boolean isnegative=false;
        if(index<s.length())
        {if(s.charAt(index)=='-')
        {
            isnegative=true;
            ++index;
        }
        else if(s.charAt(index)=='+')
        {
            ++index;
        }   
        }
        int result=0;
        while(index<len && isDigit(s.charAt(index)))
        {
            int digit=s.charAt(index)-'0';
              if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
          return isnegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
             result=result*10+digit;
            ++index;
        }
           return isnegative ? -result : result;
        
    }
     private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
}