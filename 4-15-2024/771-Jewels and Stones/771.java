class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter=0;
        HashMap<Integer,Character> map = new HashMap<>() ;
        for(int i=0; i<jewels.length(); i++)
            map.put(i, jewels.charAt(i) );
        for(int i=0; i<stones.length(); i++)
            if( map.containsValue(stones.charAt(i)))
                counter++;
        return counter;
    }
}