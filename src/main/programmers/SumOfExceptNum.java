package main.programmers;

import java.util.ArrayList;
import java.util.List;

public class SumOfExceptNum {

    public static void main(String[] args) {
        int answer = 0;
        int[] num = {0, 1, 2, 3, 4, 5,6,7,8};
        //6,7,8,9 없음
        List<Integer> list = new ArrayList();
        int n =9;
        while (n > -1) {
            list.add(n--);
        }
        for (int i : num) {
            list.remove((Integer)i);
        }
        for (Integer integer : list) {
            answer += integer;
        }
        System.out.println("answer = " + answer);
    }

}
