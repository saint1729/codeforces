import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Round527Div3TaskC {


    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        n = 2*n-2;

        if(n == 2) {
            System.out.println("PS");
            return;
        }

        int x = n;

        List<String> l = new ArrayList<>();

        while(n-- > 0) {
            l.add(reader.readLine());
        }

        List<String> l2 = new ArrayList<>(l);

        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length()-b.length();
            }
        });


        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < x; i += 2) {
            sb.append("PS");
        }

        String s = sb.toString();

        StringBuilder sb2 = new StringBuilder("");

        boolean[] visited = new boolean[x];

        Arrays.fill(visited, false);

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < x; j++) {
                if((l2.get(i).equals(l.get(j))) && (!visited[j])) {
                    visited[j] = true;
                    sb2.append(s.charAt(j));
                    break;
                }
            }
        }

        System.out.println(sb2.toString());


    }


}
