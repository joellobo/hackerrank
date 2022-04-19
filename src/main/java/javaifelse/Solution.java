package javaifelse;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean odd = N % 2 == 1;
        boolean even = !odd;
        boolean entre2E5 = N >= 2 && N <= 5;
        boolean entre6E0 = N >= 6 && N <= 20;
        boolean maior20 = N > 20;

        if (odd) {
            System.out.println("Weird");
        }
        if (even && entre2E5 ) {
            System.out.println("Not Weird");
        }
        if (even && entre6E0) {
            System.out.println("Weird");
        }
        if (even && maior20) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }

}
