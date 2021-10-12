package main.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lessons76501 {

    public static void main(String[] args) {
        int answer = 0;
        int index = 0;
        int[] numbers ={4,7,12};
        boolean[] signs = {true,false,true};

        for (int i = 0; i < numbers.length ; i++) {
            if(signs[i])
                answer += numbers[i];
            else
                answer -= numbers[i];
        }
        System.out.println("answer = " + answer);
    }
}
