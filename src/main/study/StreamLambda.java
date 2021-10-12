package main.study;

public class StreamLambda {

    public static void main(String[] args) {
        /**
         * 익명클래스 구현방식
         *  int n = 10;
         *  Calculator cal = new Calculator() {
         *      @Override
         *      public int calc(int n) {
         *          return n+1;
         *      }
         *  };
         * System.out.println("cal = " + cal.calc(n));
         */
        /**
         * 람다식 구현
         */
        int n=10;
        Calculator ca = (int a)->{return a+10;};
        Calculator cal = (a)->{return a+10;};
        Calculator calc = a->{return a+10;};
        Calculator calcu = a -> a+10;


    }
}
