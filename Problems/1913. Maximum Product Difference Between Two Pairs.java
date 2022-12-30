//MY SOLUTION  TC: O(NLogN)
class MySolution {
    public int maxProductDifference(int[] nums) {
        //If we sorted an we get Least MIN value in LH and MAX value in RH 
        //#Trick: Two Pointer method : for pair selection in array
        Arrays.sort(nums);
        //We need Least two MIN values and Last Two MAX Values
        int max = (nums[0] * nums[1]) - (nums[nums.length-1] * nums[nums.length-2]);
        //Some times the difference may be Negative. So Math.abs is used
        return Math.abs(max);
    }
}

//RUNTIME #TC
class SolutionTC {
    public int maxProductDifference(int[] nums) {
      // https://www.geeksforgeeks.org/integer-max_value-and-integer-min_value-in-java-with-examples/
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        for(int i: nums){
            if(i > a || i > b){
            a = Math.max(a, b);
            b = i;
            }

            if(i < c || i < d){
            c = Math.min(c, d);
            d = i;
            }
        }
        return (a*b)-(c*d);
    }
}

//MEMORY #SC and TC: O(N)
class SolutionSC {
        public int maxProductDifference(int[] nums) {
          // #Tricks-1 : Shorthand declaration or initializers
          //Integer.MAX_VALUE = 2^31-1 = 2147483647 ==> Trying to initialize a N with value Integer.MAX_VALUE + 1 ----> N = -2147483648 (memory will overflow and the value will get NEGATIVE.)
          //Integer.MIN_VALUE = -2^31 = -2147483648 ==>Trying to initialize a N with value Integer.MIN_VALUE - 1 ----> N = 2147483647 (memory will overflow and the value will get POSITIVE.)
          
	          int largest = 0, secondLargest = 0, smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
          
          for(int i=0;i<nums.length;i++) {
              if(nums[i]>=largest) {
                  secondLargest = largest;
                  largest = nums[i];
              } else if(nums[i]>secondLargest) secondLargest = nums[i];
                if(nums[i]<=smallest) {
                  secondSmallest = smallest;
                  smallest = nums[i];
                } else if(nums[i]<secondSmallest) secondSmallest = nums[i];
          }
            return largest * secondLargest - smallest * secondSmallest;
        }
}
