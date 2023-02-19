package src;

import java.util.*;

public class C_MaxMEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        HashSet<Integer> A = new HashSet<>();
        for (int i=0; i< N; i++) {
            A.add(scanner.nextInt());
        }
        scanner.close();

        int ans = -1;
        for(int i=0; i< K; i++) {
            if(!A.contains(i)) {
                ans = i;
                break;
            }
        }

        if (ans == -1) {
            ans = K;
        }

        System.out.println(ans);
    }
}