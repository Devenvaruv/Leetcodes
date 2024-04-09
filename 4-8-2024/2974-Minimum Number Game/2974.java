class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] result = new int[nums.length];
        int i = 0;

        for(int num: nums) minHeap.add(num);

        while(minHeap.size() >= 2) {
            int first = minHeap.poll();
            int second = minHeap.poll();

            result[i++] = second;
            result[i++] = first;
        }

        if(!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }
        return result;
    }
}