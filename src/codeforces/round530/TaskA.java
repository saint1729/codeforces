package codeforces.round530;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int w = in.nextInt();
        int h = in.nextInt();
        int u1 = in.nextInt();
        int d1 = in.nextInt();
        int u2 = in.nextInt();
        int d2 = in.nextInt();

        int ans = w;

        if(d2 < d1) {
            int temp = u2;
            u2 = u1;
            u1 = temp;

            temp = d2;
            d2 = d1;
            d1 = temp;
        }

        for(int i = h; i > 0; i--) {
            if(ans < 0) {
                ans = 0;
            }
            if(i == d1) {
                ans -= u1;
            } else if(i == d2) {
                ans -= u2;
            } else {
                ans += i;
            }
        }

        if(ans < 0) {
            ans = 0;
        }

        System.out.println(ans);

    }
}
