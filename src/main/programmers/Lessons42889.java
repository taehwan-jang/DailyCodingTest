package main.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lessons42889 {

    public static void main(String[] args) {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        List<Integer> sortStages = Arrays.stream(stages).distinct().sorted().boxed().collect(Collectors.toList());
        for (Integer sortStage : sortStages) {
            System.out.println("sortStage = " + sortStage);
        }

    }
}
