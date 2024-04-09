class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int i :nums){
            minHeap.offer(i);
        }

        int temp =-1;
        int result = 0;

        for(int i =0;i<nums.length;i++){
            int polled = minHeap.poll();
            if(polled==0 || polled==temp){

                continue;
            }
            temp=polled;
            result++;
        }

        return result;
    }
}