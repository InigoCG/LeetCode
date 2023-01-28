package LeetCode;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int longitud = nums.length;
        int[] ans = new int[longitud*2];

        if (1 <= longitud && longitud <= 1000) {
            for (int i = 0; i < longitud; i++) {
                if (1 <= nums[i] && nums[i] <= 1000) {
                    ans[i] = nums[i];
                    ans[i+longitud] = nums[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
