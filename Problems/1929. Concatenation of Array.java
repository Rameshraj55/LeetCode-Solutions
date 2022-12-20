//MY SOLUTION #ARRAY
public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i = 0 ; i < nums.length ; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
        
 }
//Best Time Complexity Solution -1//
public static int[] problem1929_TC(int[] nums) {
            int aLen = nums.length;
            int[] result = new int[aLen + aLen];
                //Practice with this ,ethod
            System.arraycopy(nums, 0, result, 0, aLen);
            System.arraycopy(nums, 0, result, aLen, aLen);
            return result;
}


//Best Space Complexity Solution-1//
public static int[] problem1929_SC(int[] nums) {
            int ans[] = new int[nums.length * 2];
        //Here oldSize and newSize is initiated inside the loop I think it Saves the Memory
        //From this w.k.t we can also initiate inside the loop also :=)
        //Concept here is Scope of Function i.e Scope of Variables within the Brackets
            for (int i = 0, oldSize = nums.length, newSize = nums.length * 2; i < newSize; i++)
                ans[i] = nums[i % oldSize];
                return ans;     
//Modulus is used.eg: oldSize =4 ; newSize = 8; i < 8; i++
// oldsizearrayindexes = 0,1,2,3 ; newsizearrindexes=4,5,6,7
        //Very very important Maths Concept
//(0%4=0)(1%4=1)(2%4=2)(3%4=3)(4%4=0)(5%4=1)(6%4=2)(7%4=3)
        //This Logic is simply copying the array by concatenating
            // ans[0,1,2,3,4,5,6,7] = nums[0,1,2,3,0,1,2,3] //ans[i] = nums[i % oldSize];
        
}
