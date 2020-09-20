//给你两个数组，arr1 和 arr2， 
//
// 
// arr2 中的元素各不相同 
// arr2 中的每个元素都出现在 arr1 中 
// 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例： 
//
// 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 
//
// 提示： 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
// Related Topics 排序 数组 
// 👍 79 👎 0

  
package leetcode.editor.cn;

public class RelativeSortArray{
    public static void main(String[] args) {
        Solution solution = new RelativeSortArray().new Solution();
        int[] arr1 = {28,6,22,8,44,17};
        int [] arr2 = {22,28,8,6};
        int[] result = solution.relativeSortArray(arr1, arr2);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int counter = 0;
        for(int i = 0; i < arr2.length; i++) {
            for (int j = counter; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    int temp = arr1[counter]; arr1[counter] = arr1[j]; arr1[j] = temp;
                    counter++;
                }
            }
        }
        if(counter < arr1.length) {
            quickSort(arr1, counter, arr1.length-1);
        }
        return arr1;

    }

    public void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    int partition(int[] a, int begin, int end) {
        // pivot: 标杆位置，counter: 小于pivot的元素的个数
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (a[i] < a[pivot]) {
                int temp = a[counter]; a[counter] = a[i]; a[i] = temp;
                counter++;
            }
        }
        int temp = a[pivot]; a[pivot] = a[counter]; a[counter] = temp;
        return counter;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}