package main.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1,2,3,4,5,6".split(","));
        List<Integer> intArr = arr.stream().map(Integer::parseInt).collect(Collectors.toList());
        intArr.stream().forEach(System.out::println);
        int sum = intArr.stream().mapToInt(i->i+10).sum();
        System.out.println("sum = " + sum);

        List<String> strings = Arrays.asList("hello", "world");
        List<String> collect = strings.stream().map(s -> s.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        for (String s : collect) {
            System.out.print(s);
        }

//        List<String> strings = Arrays.asList("Hello", "World");
//        List<String[]> collect = strings.stream().map(s -> s.split("")).collect(Collectors.toList());
//        for (String[] strings1 : collect) {
//            System.out.println(strings1.length);
//        }


    }
}
