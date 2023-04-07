package April;

public class _7thApril {
    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numenclave(grid));
    }

    private static int numenclave(int[][] grid) {
        int row = grid.length;
        if (row==0) return 0;
        int col = grid[0].length ;
        boolean[][] visited = new boolean[row][col];

        for (int i=0;i<row;i++){
            if (grid[i][0]==1 && !visited[i][0]) dfs(grid,i,0,row,col,visited);
            if (grid[i][col-1]==1 && !visited[i][col-1]) dfs(grid,i,col-1,row,col,visited);
        }
        for (int i=0;i<col;i++){
            if (grid[0][i]==1 && !visited[0][i]) dfs(grid,0,i,row,col,visited);
            if (grid[row-1][i]==1 && !visited[row-1][i]) dfs(grid,row-1,i,row,col,visited);
        }
        int ans=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (grid[i][j]==1 && !visited[i][j]) ans++;
            }
        }
        return ans;
    }
//    private static boolean solve(int[][] grid, int i, int j, int row, int col, boolean[][] visited) {
//        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j]!=1) {
//            return false;
//        }
//        if (grid[i][j]==1 && visited[i][j]) return true;
//        visited[i][j] =true;
//        grid[i][j] = 2;
//        if (i-1>=0)
//            solve(grid,i-1,j,row,col,visited);
//        if (j-1>=0)
//            solve(grid,i,j-1,row,col,visited);
//        if (i+1<row)
//            solve(grid,i+1,j,row,col,visited);
//        if (j+1<col)
//            solve(grid,i,j+1,row,col,visited);
//        return true;
//    }
    private static void dfs(int[][] grid, int i, int j, int row, int col, boolean[][] visited) {
        if (i<0 || j<0 || i>=row || j>=col || grid[i][j]==0 || visited[i][j]) return ;

        visited[i][j] =true;
        int[] dirx = {0,1,0,-1};
        int[] diry = {1,0,-1,0};
        for (int k=0;k<4;k++){
            dfs(grid,i+dirx[k] , j+diry[k],row,col,visited);
        }
        return;
    }
}
