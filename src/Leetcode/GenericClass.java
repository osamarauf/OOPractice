package Leetcode;

public class GenericClass {

//    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] largestSum = largestSum(nums);
//        System.out.println(Arrays.toString(largestSum));
//        String name = "Osama";
//        palindrome(name);
//        int n = 5;
//    }
    public int num;
    public String name;

    public GenericClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public GenericClass() {
        this.num = 12;
        this.name = "Hamza";
    }


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

//    static void palindrome(String name){
////        name = Arrays.toString(name.toCharArray());
//        StringBuilder temp = new StringBuilder();
//        for (int i = name.length()-1; i >= 0; i--) {
//            temp.append(name.charAt(i));
//        }
//        System.out.println(temp);
//    }

    // Task 1
    // Given an integer array nums, find the subarray with the largest sum, and return its sum.

    //Example 1:
    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]

    // Output: 6
    //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

//    static int[] largestSum(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length-1; j++) {
//                if (arr[j]>arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//        int[] temp = new int[arr.length];
//        int j = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                temp[j++] = arr[i];
//            }
//        }
//        int[] result = new int[j];
//        for (int i = 0; i < j; i++) {
//            result[i] = temp[i];
//        }
//        return result;
//    }

    // *****
    // ****
    // ***
    // **
    // *
//    static void pattern1(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = n-i; j > 0; j--) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//    }

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

//    static void pattern2(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }
//    }
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

//    static void pattern3(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }
//    }
}
