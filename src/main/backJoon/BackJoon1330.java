package main.backJoon;

import java.util.Scanner;

public class BackJoon1330 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();


        System.out.println(((A > B) ? ">" : (A < B) ? "<" : "=="));
    }
}
