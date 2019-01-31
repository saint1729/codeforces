package codeforces.contest1104;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASplittingIntoDigits {

   public void solve(int testNumber, InputReader in, OutputWriter out) {

      int n = in.nI();
      if(n < 10) {
         out.p(n);
         out.p(n);
      }
      Map<Integer, Integer> m = new HashMap<>();

      int i = 9;

      int digits = 0;

      while((i > 0) && (n >= 0)) {

         int div = n/i;

         m.put(i, div);

         n = n-div*i;

         n = n%i;
         i -= 1;
         digits += div;
      }

      out.pn(digits);

   }
}
