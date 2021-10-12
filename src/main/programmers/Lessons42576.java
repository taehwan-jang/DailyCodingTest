package main.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lessons42576 {

    public static void main(String[] args) {
        String[] participation = {"a", "b", "c", "d"};
        String[] completion = {"a", "b", "d"};

        solution(participation, completion);
    }

    public static void solution(String[] participation, String[] completion) {
        List<String> partiList = Arrays.stream(participation).sorted().collect(Collectors.toList());
        List<String> compList = Arrays.stream(completion).sorted().collect(Collectors.toList());
        for (int i = 0; i < compList.size(); i++) {
            if(!partiList.get(i).equals(compList.get(i))){
                System.out.println("partiList = " + partiList.get(i));
                return;
            }
        }
        System.out.println(partiList.get(partiList.size() - 1));

    }
}
