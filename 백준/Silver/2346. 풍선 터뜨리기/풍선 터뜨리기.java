import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] location = new int[N];
        for (int i = 0; i < N; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        sb.append("1 ");
        int move = location[0];

        for (int i = 1; i < N; i++) {
            queue.add(new Balloon(i+1, location[i]));
        }

        while(!queue.isEmpty()){
            if(move > 0) {
                for (int i = 1; i < move; i++) {
                    queue.add(queue.poll());
                }
                Balloon next = queue.poll();
                move = next.numValue;
                sb.append(next.index + " ");
            }
            else{
                //뒤에 있는 요소들 모두 앞으로 보낸다.
                for(int i = 1; i < -move; i++){
                    queue.addFirst(queue.pollLast());
                }
                //모두 뒤로 보냈다면
                Balloon next = queue.pollLast();
                move = next.numValue;
                sb.append(next.index+" ");
            }

        }
        System.out.println(sb);
    }
}

class Balloon {
    int index;
    int numValue;

    public Balloon(int index, int numValue) {
        this.index = index;
        this.numValue = numValue;
    }
}