//MY SOLUTION--> BEST in SC
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int noOfGoodTriplets = 0;
        if(arr.length < 3 || arr == null) return 0;
        for(int i=0; i<arr.length -2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++ ){
            if( Math.abs(arr[i]-arr[j]) <=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                    noOfGoodTriplets++;
                }
            }
        }
        return noOfGoodTriplets;        
    }
}


//TC Solution 
class SolutionTC {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int m = 1000;
        int n = arr.length;
        
        int[] valuesBefore = new int[m+1];
        valuesBefore[arr[0]] = 1;
        
        Fenv valuesAfter = new Fenv(m+1);
        for(int i = 2; i < n; i++)
            valuesAfter.add(arr[i], 1);
        
        int ans = 0;
        for(int j = 1; j < n-1; j++) {
            int currVal = arr[j];
            int limUpA = Math.min(m, currVal + a);
            int limLoA = Math.max(0, currVal - a);
            
            int limUpB = Math.min(m, currVal + b);
            int limLoB = Math.max(0, currVal - b);
            for (int prevVal = limLoA; prevVal <= limUpA; prevVal++) {
                if (valuesBefore[prevVal] == 0)
                    continue;
                
                int limUpC = Math.min(prevVal + c, limUpB);
                int limLoC = Math.max(prevVal - c, limLoB);
                if (limLoC > limUpC)
                    continue;
                
                if (limLoC == 0)
                    ans += valuesBefore[prevVal]*valuesAfter.getSum(limUpC);
                else 
                    ans += valuesBefore[prevVal]*valuesAfter.getSum(limLoC, limUpC);
            }
            valuesBefore[currVal]++;
            valuesAfter.add(arr[j+1], -1);
        }
        return ans;
    }
}
class Fenv {
        private int[] tree;

        public int getSum(int i, int j) {
            return getSum(j) - getSum(i-1);
        }
            
        public int getSum(int idx) {
            int res = 0;
            for (int i = idx + 1; i > 0; i -= i&(-i)) 
                res += tree[i];
            return res;
        }
        
        public void add(int idx, int val) {
            for (int i = idx + 1; i < tree.length; i += i&(-i)) 
                tree[i] += val;
        }
        
        public Fenv(int size) {
            tree = new int[size+1];
        }
    }
