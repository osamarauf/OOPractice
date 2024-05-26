import java.util.Arrays;

public class GenericClass {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] largestSum = largestSum(nums);
        System.out.println(Arrays.toString(largestSum));
    }
    private int num;
    private String name;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Task 1
    // Given an integer array nums, find the subarray with the largest sum, and return its sum.

    //Example 1:
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

    // Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

    static int[] largestSum(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }


    }
}
