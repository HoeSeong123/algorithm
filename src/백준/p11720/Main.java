package 백준.p11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split("");

        int answer = 0;

        for(String number : numbers) {
            answer += Integer.parseInt(number);
        }

        System.out.println(answer);
    }
}
