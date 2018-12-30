import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GoodBye2018ProblemC {


    public static int fun(int n, int k) {
        int sum = 0;
        int x = 1;

        do {
            sum += (x == 0 ? n : x);
            x += k;
            x = x%n;
        } while(x != 1);

        return sum;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), k = 1;

        Set<Integer> s = new TreeSet<>();

        while(k <= n) {
            s.add(fun(n , k));
            // System.out.println(n + " " + k + " " + fun(n, k));
            k += 1;
        }

        StringBuilder sb = new StringBuilder();

        for(Integer i : s) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString());

    }


}
