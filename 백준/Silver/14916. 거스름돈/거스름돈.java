import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (N % 5 == 0 && N != 0) {
                count++;
                N = N - 5;
            } else if (N / 2 >= 1) {
                count++;
                N = N - 2;
            } else if (N != 0) {
                System.out.println("-1");
                break;
            } else {
                System.out.println(count);
                break;
            }
        }
    }
}