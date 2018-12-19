//package com.codeforces.round527Div3;

import java.util.Scanner;

public class Round527Div3TaskA {

    public static void main(String[] args) {

        int t, n, k;

        Scanner scanner = new Scanner(System.in);

        t = scanner.nextInt();

        while(t-- > 0) {

            n = scanner.nextInt();
            k = scanner.nextInt();

            StringBuilder sb = new StringBuilder("");

            int div = n/k;
            int rem = n%k;

            for(int i = 0; i < div; i++) {
                for(int j = 0; j < k; j++) {
                    sb.append((char)(j+'a'));
                }
            }

            for(int i = 0; i < rem; i++) {
                sb.append((char)(i+'a'));
            }

            System.out.println(sb.toString());

        }

    }

}
