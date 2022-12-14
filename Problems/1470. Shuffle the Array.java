/HINT
// [ 11,   22, 33,  44,  55,        66,           77,           88,            99,       100      ]
// [ i=0, i=1, i=2, i=3, i=4,  0+5((i=0)+n), 0+6((i=1)+n), 0+7((i=2)+n), 0+8((i=3)+n), 0+9((i=4)+n)  ] // i is incrementing by 1 for each pass and here n =5 if //array size is even then n =10
// then we can use this hint
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<n ;i++){
            ans[i*2] = nums[i];       // i*2 is EVEN INDEXED POSITION
            ans[i*2+1] = nums[i+n];   // i*2+1 is ODD INDEXED POSITION
        }
        return ans;
    }
