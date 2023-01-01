//MY SOLUTION 
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;
        for(int i=0; i<n-1; i++){
            result[i] = i+1;
            sum += result[i];
        }
        result[n-1] = -sum;
        return result;
    }
}


//TC and SC O(N)
class SolutionTC {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for(int i=0;i<n/2;i++){
            res[i]=-1*(i+1);
            res[n-i-1]=(i+1);
        }
        return res;
    }
}

//TC O(N)
class Solution {
  public int[] sumZero(int n) {
    int[] ans = new int[n];
    for (int i = 0; i < n; ++i)
      ans[i] = 2 * i - n + 1;

    return ans;
  }
}
