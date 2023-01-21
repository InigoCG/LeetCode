package LeetCode;

class twoSums {
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    ret[0] = j;
                    ret[1] = i;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int [] resultado = twoSum(nums, target);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
}