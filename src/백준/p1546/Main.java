package 백준.p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(br.readLine());
        double[] numbers = new double[N];
        double max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            double number = Double.valueOf(st.nextToken());
            numbers[i] = number;
            max = Math.max(number, max);
            sum += number;
        }

        double answer = sum / max * 100 / N;

        System.out.println(answer);
    }
}
