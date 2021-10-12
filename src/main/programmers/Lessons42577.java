package main.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Lessons42577 {

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "195524421","9"};
        solution(phone_book);
    }
    public static void solution(String[] phone_book) {

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : phone_book) map.put(s, 0);
        for (String s : map.keySet()) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.substring(0,i))) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
