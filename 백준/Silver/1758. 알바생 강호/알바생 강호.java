import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long answer = 0;
        int[] tips = new int[N];

        for (int i = 0; i < N; i++)
            tips[i] = Integer.parseInt(br.readLine());
        Arrays.sort(tips);

        for (int i = N-1; i >= 0 ; i--){
            int tip = tips[i] - (N-i-1);
            if(tip > 0)
                answer += tip;
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}