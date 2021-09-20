package main.backJoon;

import java.util.Scanner;

public class BackJoon2588 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        int firstB = B / 100;
        int middleB = (B%100)/10;
        int lastB = (B % 10);

        System.out.println((A*lastB));
        System.out.println((A*middleB));
        System.out.println((A*firstB));
        System.out.println(((A*lastB)+(A*middleB)*10+(A*firstB)*100));

    }
}
