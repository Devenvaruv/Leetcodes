class Solution {
    public int maxProduct(int[] nums) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.offer(num);
        }

        int a = maxHeap.poll();
        int b = maxHeap.poll();
        return (a - 1) * (b - 1);
    }
}