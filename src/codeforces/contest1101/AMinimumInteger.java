package codeforces.contest1101;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AMinimumInteger {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        StringBuilder sb = new StringBuilder("");

        for(int i = in.nI(); i > 0; i--) {
            int l = in.nI();
            int r = in.nI();
            int d = in.nI();

            if((d < l) || (d > r)) {
                sb.append(d).append("\n");
            } else {
                sb.append((r/d+1)*d).append("\n");
            }
        }

        out.p(sb);

        return;
    }
}
