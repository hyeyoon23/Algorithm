import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) list.add(i);

        bw.write("<");
        int index = 0;

        while (list.size() > 1) {
            index = (index + K - 1) % list.size();
            bw.write(list.get(index) + ", ");
            list.remove(index);
        }

        bw.write(list.get(0) + ">");
        bw.flush();
    }
}