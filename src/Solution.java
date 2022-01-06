class Solution {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int tem = 0;
        for(int i :  nums){
            tem ^= i;
        }
        int div = 1;
        while ((tem & div) == 0){
            div <<= 1;
        }
        for (int i: nums){
            if ((i & div) != 0){
                res[0] ^= i;
            }else {
                res[1] ^= i;
            }
        }
        return  res;
    }

}