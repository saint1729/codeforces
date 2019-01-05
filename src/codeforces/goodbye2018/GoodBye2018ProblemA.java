package codeforces.goodbye2018;

import java.util.Scanner;

public class GoodBye2018ProblemA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();

        int min = Math.min(y, Math.min(b-1, r-2));

        if(y == min) {
            System.out.println(3*y+3);
        } else if(b-1 == min) {
            System.out.println(3*b);
        } else {
            System.out.println(3*r-3);
        }

    }

}
