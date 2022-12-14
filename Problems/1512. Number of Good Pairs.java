8.=====================1512. Number of Good Pairs==================================
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i=0; i<nums.length ;i++){
            for(int j=0; j<nums.length  ;j++){
                if(nums[i] == nums[j] && i<j) goodPairs++; // WE USED INCREMENT instead of { goodPairs = goodPairs +1 or goodPairs += 1 } ;
            }
        }
        return goodPairs;
    }
}
