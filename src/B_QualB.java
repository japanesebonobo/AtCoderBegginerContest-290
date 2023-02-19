package src;
import java.util.*;

public class B_QualB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();

        char s[] = S.toCharArray();
        char ans[] = new char[N];

        int pass = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'o' && pass < K) {
                ans[i] = 'o';
                pass++;
            } else {
                ans[i] = 'x';
            }
            System.out.print(ans[i]);
        }
        scanner.close();
    }
}

