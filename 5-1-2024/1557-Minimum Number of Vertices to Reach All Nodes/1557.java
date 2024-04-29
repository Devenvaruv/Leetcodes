class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> vertices = new HashSet<Integer>();

        for(int i = 0; i < edges.size(); i++){
            vertices.add(edges.get(i).get(1));
        }

        for(int i = 0; i < n; i++){
            if(!vertices.contains(i)){
                result.add(i);
            }
        }

        System.out.println(result);
        System.out.println(vertices);

        return result;
    }
}