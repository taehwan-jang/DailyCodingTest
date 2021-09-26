package main.programmers;

public class ReversTernary {

    public static void main(String[] args) {
        int n = 45;
        StringBuffer bf = new StringBuffer();
        while(n>0){
            bf.append(n % 3);
            n/=3;
        }
        String s = bf.toString();
        System.out.println(Integer.parseInt(s,3));


    }
}
