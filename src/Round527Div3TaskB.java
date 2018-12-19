import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Round527Div3TaskB {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        reader.readLine();

        int[] a = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a);

        int ans = 0;

        for(int i = 0; i < a.length; i += 2) {
            ans += (a[i+1]-a[i]);
        }

        System.out.println(ans);

    }

}
