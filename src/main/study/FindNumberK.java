package main.study;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindNumberK {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5);
        int K = 2;
        System.out.println(solution(arr, K));
    }

    public static String solution(List arr, int K) {
        boolean b = arr.stream().anyMatch(Predicate.isEqual(K));

        if(b) return "yes";

        return "no";
    }

}
