import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String response = poliomino(s);
        System.out.println(response);
    }

    private static String poliomino(String s) {
        String answer = "";

        s = s.replaceAll("XXXX", "AAAA");
        answer = s.replaceAll("XX", "BB");

        if (answer.contains("X")) answer = "-1";

        return answer;
    }
}