package main.backJoon;

import java.util.Scanner;

public class BackJoon14681 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);int X = s.nextInt();int Y = s.nextInt();System.out.println((X>0)?(Y>0)?1:4:(Y>0)?2:3);
    }
}
