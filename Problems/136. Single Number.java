//Solution #TC #Bit Manipulation 
/*
 1.  A^A=0          A^B^A=B         (A^A^B) = (B^A^A) = (A^B^A) = B This shows that position doesn't matter.
 2.  Similarly , if we see , a^a^a......... (even times)=0 and a^a^a........(odd times)=a
Why does this work ??
Because , the elements with frequency=2 will result in 0. And then the only element with frequency=1 will generate the answer.
*/
class SolutionTC1 {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int num : nums) ans ^= num;
        return ans;
    }
}

-----------------------------------------------
  class SolutionTC2 {
    public int singleNumber(int[] nums) {
        int s = nums[0];

        for(int i = 1; i < nums.length; i++)
            s ^= nums[i];
        
        return s;
    }
}
----------------------------------------------------
