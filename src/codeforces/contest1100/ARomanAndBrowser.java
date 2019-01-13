package codeforces.contest1100;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ARomanAndBrowser {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nI(), k = in.nI();
        int[] a = in.nextIntArray(n);
        //out.p(-30/47);

        for (int b = 1; b <= n; b++) {
            int count = 0;
            for(int i = -n/2; i <= (n-1)/2; i++) {
                int c = b + i * k;
                if(c > 0) {
                    count++;
                }
            }
        }
    }
}
