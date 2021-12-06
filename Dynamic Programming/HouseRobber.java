//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

//Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
class Solution {
    public int rob(int[] nums) {
        int now=0;
        int last=0;
        for(int num:nums)
        {
            int temp=now;
            now=Math.max(last+num,now);
            last=temp;
        }
        return now;
    }
}