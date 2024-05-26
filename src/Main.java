import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        GenericClass gc = new GenericClass();

        gc.setName("Osama");
        gc.setNum(3);

        System.out.println(gc.getName() + gc.getNum());

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(0);
        num.add(5);
        num.add(0);
        num.add(8);

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) %2==0){
                num.remove(i);
            }
        }

        //Move Zero's to end of the array
        int count = 0;
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i)!=0){
                num.set(count++, num.get(i));
            }
        }

        while (count < num.size()){
            num.set(count++, 0);
        }

        System.out.println(num);
        int[] arr = {1, 2, 3, 4};
        int[] ceilarr = {2, 3, 5, 9, 14, 16, 18};
        int k = 12;
        char[] letters = {'c', 'd', 'f', 'j'};
        char target = 'e';
        int start = 0;
        int end = letters.length-1;
        int ans = linearSearch(arr, k);
        System.out.println(ans);

        char greatestLetter = nextGreatestLetter(letters, target, start, end);
        System.out.println("nextGreatestLetter after " + target + " is " + greatestLetter);

        int[] unsortedarr = {3,30,34,5,9};
//        bubbleSort(unsortedarr);
//        System.out.println("bubble sorted array" + Arrays.toString(unsortedarr));

        String largestNum = largestNumber(unsortedarr);
        System.out.println("Largest Number: " + largestNum);


        // Leetcode 451 Sort Characters By Frequency
        String s = "tree";
        Map<Character, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        char maxChar = '\0';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Character with maximum frequency: " + maxChar);
        System.out.println("Maximum frequency: " + maxFreq);



    }

    // Leetcode 1539 Kth Missing Positive Number
    static int linearSearch(int[] arr, int k){
        if(arr.length == 0){
            return -1;
        }

        // [1, 2, 3, 4], k=2
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]<k){
                k++;
            }
        }

        return k;
    }
    // [1, 2, 3, 4]
    public static int binarySearch(int[] arr, int target, int start, int end){
        if (start<=end){
            int mid = (start+end)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
                return binarySearch(arr, target, start, end);
            }
            else{
                end = mid-1;
                return binarySearch(arr, target, start, end);
            }
        }
        return -1;
    }

    // [2, 3, 5, 9, 14, 16, 18]
    public static int ceilingOFANumber(int[] arr, int target, int start, int end){
        if (start<=end){
            int mid = (start+end)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
                return ceilingOFANumber(arr, target, start, end);
            }
            else{
                end = mid-1;
                return ceilingOFANumber(arr, target, start, end);
            }
        }
        return arr[start];
    }

    public static char nextGreatestLetter(char[] letters, char target, int start, int end){
        while (start<=end){
            int mid = (start+end)/2;
            if (target>=letters[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }
    //  0  1  2  3  4
    // [3, 1, 5, 4, 2]
    //  i  j
    public static void bubbleSort(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idx]>arr[j])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // [3, 1, 5, 4, 2]
    static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    // Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
    // Since the result may be very large, so you need to return a string instead of an integer.

    // Example 1:
    // Input: nums = [10,2]
    // Output: "210"

    static String largestNumber(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[max_idx]<arr[j])
                    max_idx = j;
            }
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
        StringBuilder result = new StringBuilder();

        for (int num : arr) {
            result.append(num);
        }
        return result.toString();
    }


    // Task 2
    //Given a string s, find the length of the longest substring without repeating characters.

    // Example 1:
    //Input: s = "abcabcbb"

    // Output: 3
    //Explanation: The answer is "abc", with the length of 3.

}