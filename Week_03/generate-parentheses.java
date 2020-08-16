import java.util.*;
import java.nio.charset.*;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> outputs = solution.generateParenthesis(3);
        System.out.println(outputs);
    }


    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        if (n == 0) {
            return res;
        }

        dfs("", n, n, res);
        return res;
    }


    private void dfs(String curStr, int left, int right, List<String> res) {

        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(curStr + "(", left - 1, right, res);
        }

        if (right > 0) {
            dfs(curStr + ")", left, right - 1, res);
        }
    }

}