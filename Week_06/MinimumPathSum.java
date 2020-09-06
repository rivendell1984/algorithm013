//给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。 
//
// 说明：每次只能向下或者向右移动一步。 
//
// 示例: 
//
// 输入:
//[
//  [1,3,1],
//  [1,5,1],
//  [4,2,1]
//]
//输出: 7
//解释: 因为路径 1→3→1→1→1 的总和最小。
// 
// Related Topics 数组 动态规划 
// 👍 656 👎 0

  
package leetcode.editor.cn;

public class MinimumPathSum{
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
        int[][] grid = new int[][] {
                {1,2,5},
                {3,2,1}
        };
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < n; i++) dp[0][i] = grid[0][i] + dp[0][i-1];
        for(int j = 1; j < m; j++) dp[j][0] = grid[j][0] + dp[j-1][0];

        for(int row = 1; row < m; row++) {
            for(int col = 1; col < n; col++) {
                dp[row][col] = Math.min(grid[row][col] + dp[row-1][col], grid[row][col] + dp[row][col-1]);
            }
        }
        return dp[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}