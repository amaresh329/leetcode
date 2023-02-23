//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int mod = 1000 * 1000 * 1000 + 7;
    static int memoizationUtil(int[][] grid, int row, int col, int[][] dp) {
		if (grid[row][col] == 0) {
			return dp[row][col] = 0;
		}
		if (dp[row][col] != -1) {
			return dp[row][col];
		}
		dp[row][col] = (memoizationUtil(grid, row - 1, col, dp) % mod + memoizationUtil(grid, row, col - 1, dp) % mod) % mod;
		return dp[row][col];
	}
    static int memoization(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		int i = 0;
		for (; i < obstacleGrid.length; i++) {
			if (obstacleGrid[i][0] == 1) {
				dp[i][0] = 1;
			} else {
				break;
			}
		}
		for (; i < obstacleGrid.length; i++) {
			dp[i][0] = 0;
		}
		i = 0;
		for (; i < obstacleGrid[0].length; i++) {
			if (obstacleGrid[0][i] == 1) {
				dp[0][i] = 1;
			} else {
				break;
			}
		}
		for (; i < obstacleGrid[0].length; i++) {
			dp[0][i] = 0;
		}
		return memoizationUtil(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1, dp);
    }
    static int uniquePaths(int n, int m, int[][] grid) {
        return memoization(grid);
    }
};