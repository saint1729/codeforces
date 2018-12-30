import java.util.*;

public class GoodBye2018ProblemB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> l = new ArrayList<>();
        List<List<Integer>> l2 = new ArrayList<>();

        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            String[] s = scanner.nextLine().split(" ");
            temp.add(Integer.parseInt(s[0]));
            temp.add(Integer.parseInt(s[1]));
            l.add(temp);
        }

        for(int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            String[] s = scanner.nextLine().split(" ");
            temp.add(Integer.parseInt(s[0]));
            temp.add(Integer.parseInt(s[1]));
            l2.add(temp);
        }

        Collections.sort(l, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                if(a.get(0) < b.get(0)) {
                    return -1;
                } else if(a.get(0) == b.get(0)) {
                    return a.get(1).compareTo(b.get(1));
                } else {
                    return 1;
                }
            }
        });

        Collections.sort(l2, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                if(a.get(0) < b.get(0)) {
                    return -1;
                } else if(a.get(0) == b.get(0)) {
                    return a.get(1).compareTo(b.get(1));
                } else {
                    return 1;
                }
            }
        });

        int x = l.get(0).get(0)+l2.get(l2.size()-1).get(0);
        int y = l.get(0).get(1)+l2.get(l2.size()-1).get(1);


        System.out.println(x + " " + y);

    }

}
