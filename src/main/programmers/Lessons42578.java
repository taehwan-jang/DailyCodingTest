package main.programmers;

import java.util.HashMap;
import java.util.HashSet;

public class Lessons42578 {

    public static void main(String[] args) {
        String[][] cloth = {
                {"A", "headgear"},
                {"B", "eyewear"},
                {"C", "pants"},
                {"D", "pants"},
                {"E", "headgear"}
        };
        solution(cloth);
    }
    public static void solution(String[][] clothes) {
        HashMap<String, HashSet<String>> items = new HashMap<>();
        int answer =1;
        for (int i = 0; i < clothes.length; i++) {
            if(!items.containsKey(clothes[i][1])){
                items.put(clothes[i][1],new HashSet());
                items.get(clothes[i][1]).add(clothes[i][0]);
                continue;
            }
            items.get(clothes[i][1]).add(clothes[i][0]);
        }
        for (String category : items.keySet()) {
            answer *= items.get(category).size()+1;
        }
        answer-=1;
        System.out.println("answer = " + answer);
    }
}
