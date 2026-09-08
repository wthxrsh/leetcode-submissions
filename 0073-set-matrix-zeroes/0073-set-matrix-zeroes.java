class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    res.add(i);
                    res.add(j);
                }
            }
        }
        for(int i = 0 ;i<res.size();i+=2){
            for(int j = 0;j<matrix[res.get(i)].length;j++){
                matrix[res.get(i)][j] = 0;
            }
        }
        for(int c = 1;c<res.size();c+=2){
            for(int j = 0;j<matrix.length;j++){
                matrix[j][res.get(c)] = 0;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna