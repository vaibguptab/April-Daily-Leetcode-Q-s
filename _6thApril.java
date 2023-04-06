package April;

public class _6thApril {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        System.out.println(moofclosedisland(grid));
}

    private static int moofclosedisland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0 && !visit[i][j] && dftraversal(grid,i,j,visit)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean dftraversal(int[][] grid, int x, int y, boolean[][] visit) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return false;
        }
        if (grid[x][y] == 1 || visit[x][y]) {
            return true;
        }

        visit[x][y] = true;
        boolean isClosed = true;
        int[] dirx = {0, 1, 0, -1};
        int[] diry = {-1, 0, 1, 0};

        for (int i = 0; i < 4; i++) {
            int r = x + dirx[i];
            int c = y + diry[i];
            if (!dftraversal(grid,r,c,visit)) {
                isClosed = false;
            }
        }

        return isClosed;
    }


}
