/*
Time Complexity - O(n)
Space Complexity - O(n) - create n lists
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        output.add(firstRow);
        if(numRows == 0 || numRows == 1) return output;
        for(int i=1;i<numRows;i++){
            List<Integer> previousRow = output.get(i-1);
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
            for(int j=1;j<i;j++){
                int sum = previousRow.get(j) + previousRow.get(j-1);
                currentRow.add(sum);
            }
            currentRow.add(1);
            output.add(currentRow);
        }
        return output;
    }
}
