class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int[] ans=new int[nums.length];
        int index=0;
        int[]copy=Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        for(int i=0;i<copy.length;i++){
            if(!mp.containsKey(copy[i])){
                mp.put(copy[i],i);
            }
        }
        for(int i=0;i<nums.length;i++){
            ans[index++]=mp.get(nums[i]);
        }
        return ans;
    }
}