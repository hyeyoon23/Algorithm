import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] rope = new int[N];

        for (int i = 0; i < N; i++) {
            rope[i] = sc.nextInt();
        }

        Arrays.sort(rope);
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int temp = rope[i] * (N-i);
            answer = Math.max(answer, temp);
        }
        System.out.println(answer);
    }
}