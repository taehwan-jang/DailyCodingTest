package main.backJoon;

import java.io.*;
public class BackJoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length/2; i++) {
            Integer num = Integer.parseInt(input[i * 2 + 1]) + Integer.parseInt(input[i * 2 + 2]);
            bw.append(num + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}