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
        int k = 3;
        int start = 0;
        int end = arr.length-1;
        int ans = linearSearch(arr, k);
        System.out.println(ans);

        int targetFound = binarySearch(arr, k, start, end);
        System.out.println("targetFound at index: "+targetFound);


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
        while (start<=end){
            int mid = (start+end)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }



}