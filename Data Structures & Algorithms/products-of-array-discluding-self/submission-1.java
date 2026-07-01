class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Optimal Solution

        int n = nums.length;
        int[] answer = new int[n];
        int leftProduct = 1;

        for(int i=0;i<n;i++){
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;

        //Brute - Force

        // int n = nums.length;
        // int[] result = new int[n];

        // for(int i=0;i<n;i++){
        //     int product = 1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             product = product*nums[j];
        //         }
        //     }
        //     result[i] = product;            
        // }

        // return result;
    }
}  
