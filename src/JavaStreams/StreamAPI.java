package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


    public static void main(String[] args) {

        //Input: s = "is2 sentence4 This1 a3"
        //Output: "This is a sentence"

        String s = "is2 sentence4 This1 a3";
        String wordStream = Arrays.stream(s.split(" ")).sorted((word1, word2) -> {
            int num1 = Integer.parseInt(word1.replaceAll("\\D", ""));
            int num2 = Integer.parseInt(word2.replaceAll("\\D", ""));
            return Integer.compare(num1, num2);
        }).collect(Collectors.joining(" "));

        System.out.println(wordStream.replaceAll("\\d", ""));
    }


}
