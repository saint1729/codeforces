import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class GoodBye2018ProblemC {

     public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
           long n = sc.nextInt();
           Stack<Long> s = new Stack();
           for(long i=1; i*i <= n; i++) {
               if(n%i == 0) {
                   System.out.print(n*(i-1)/2+i+" ");
                   if (i*i < n) {
                       long j = n/i;
                       s.add(n*(j-1)/2+j);
                   }
               }
           }
           while(!s.isEmpty()) {
               long j = s.pop();
               System.out.print(j+" ");
           }
     }

}







































