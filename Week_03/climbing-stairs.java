import java.util.*;
import java.nio.charset.*;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int output = solution.climbStairs(3);
        System.out.println(output);
    }


    public int climbStairs(int n) {

        if(n == 2) {
            return 2;
        }
        if(n == 1) {
            return 1;
        }

        int i = 1;
        int j = 2;
        int temp = 0;
        for(int k =3; k<=n; k++) {
            temp = i + j;
            i = j;
            j = temp;
        }
        return temp;

    } 
}