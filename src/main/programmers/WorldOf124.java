package main.programmers;

public class WorldOf124 {

    public static void main(String[] args) {
        int n = 10;
        StringBuffer bf = new StringBuffer();
        while (n != 0) {
            int i = n % 3;
            if (i == 0) {
                n -= 1;
                bf.append(4);
            } else {
                bf.append(i);
            }
            n/=3;
        }
        String result = bf.reverse().toString();
        System.out.println("result = " + result);

    }
}
