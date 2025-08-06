package edu.murat.git;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(13,15));
        System.out.println(sub(333,222));
        System.out.println(mul(23,3));
        System.out.println(div(40, 10));
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int and(int x, int y) {
        return x & y;
    }
}
