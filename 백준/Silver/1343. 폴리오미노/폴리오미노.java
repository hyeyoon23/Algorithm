import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String response = "";

        response = poliomino(s);
        System.out.println(response);
    }

    private static String poliomino(String s) {
        String answer = "";
        String A = "AAAA";
        String B = "BB";

        s = s.replaceAll("XXXX", A);
        answer = s.replaceAll("XX", B);

        if (answer.contains("X")) answer = "-1";

        return answer;
    }
}