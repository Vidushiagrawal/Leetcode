class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;

            }
        }
        for(int i=0;i<n;i++){
            int k=0;
            int l=n-1;
            while(k<l){
                int t=matrix[i][k];
                matrix[i][k]=matrix[i][l];
                matrix[i][l]=t;
                k++;
                l--;
            }
        }
    }
}