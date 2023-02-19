package src;
import java.util.*;

public class A_ContestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int A[] = new int[N];
        int B[] = new int[M];

        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        long ans = 0;

        for (int i = 0; i < B.length; i++) {
            ans += A[B[i]-1];
        }

        System.out.println(ans);
        scanner.close();
    }
}

