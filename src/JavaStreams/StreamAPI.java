package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


    public static void main(String[] args) {


        String word1 = "ab", word2 = "pqr";
        String finalString = mergeAlternately(word1, word2);
        System.out.println(finalString);

        //Input: s = "is2 sentence4 This1 a3"
        //Output: "This is a sentence"

        String s = "is2 sentence4 This1 a3";
        String wordStream = Arrays.stream(s.split(" ")).sorted((words1, words2) -> {
            int num1 = Integer.parseInt(words1.replaceAll("\\D", ""));
            int num2 = Integer.parseInt(words2.replaceAll("\\D", ""));
            return Integer.compare(num1, num2);
        }).collect(Collectors.joining(" "));

//        System.out.println(wordStream.replaceAll("\\d", ""));
    }

    // word1 = "abc", word2 = "pqr"
    public static String mergeAlternately(String word1, String word2) {
        char[] word1Chars = word1.toCharArray();
        char[] word2Chars = word2.toCharArray();
        StringBuilder mergedString = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            for (int j = i; j < i+1; j++) {
                mergedString.append(String.valueOf(word1Chars[i]));
                mergedString.append(String.valueOf(word2Chars[j]));
            }

        }

        if (word1.length() > word2.length()) {
            for (int i = minLength; i < word1.length(); i++) {
                mergedString.append(word1Chars[i]);
            }
        } else if (word2.length() > word1.length()) {
            for (int i = minLength; i < word2.length(); i++) {
                mergedString.append(word2Chars[i]);
            }
        }

        return mergedString.toString();

    }



}
