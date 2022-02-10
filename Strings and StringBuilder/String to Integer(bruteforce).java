
/*
The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.


Let's understand what
if(result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
         return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
means in JAVA? You will be able to figure out this statement easily for C++ code too.

result > (Integer.MAX_VALUE / 10) means:
Suppose,
result = 214748365(9 digits)
Integer.MAX_VALUE = 2147483647(10 digits) and Integer.MAX_VALUE / 10 = 214748364(9 digits)
Here, it is clearly evident that result > Integer.MAX_VALUE / 10( i.e. 214748365 > 214748364) and if we try to add even 0(zero) in result 214748365(9 digits), the number will become 2147483650(10 digits) which is obviously greater than 2147483647(Integer.MAX_VALUE which is of 10 digits). So even before adding 0(zero) or any other digit, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, in order to avoid integer overflow.

And, result == (Integer.MAX_VALUE / 10) && digit > 7 means:
Suppose,
result = 214748364(9 digits), and
Integer.MAX_VALUE / 10 = 214748364(9 digits)
Now, if the result is equal to the Integer.MAX_VALUE / 10 (214748364 == 214748364) and the digit is greater than 7 i.e. digit > 7 and if we try to add 8(assume the digit greater than 7 to be 8) to the result, then the number will become 2147483648(10 digits), which will result in integer overflow. So, even before adding the digit which is greater than 7, we return the Integer.MAX_VALUE or Integer.MIN_VALUE, according to the sign case, to avoid integer overflow.

 */

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