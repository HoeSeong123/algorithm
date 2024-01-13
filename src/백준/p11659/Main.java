package 백준.p11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());

        int[] numbers = new int[N + 1];
        int[] sums = new int[N + 1];
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++) {
            int number = Integer.valueOf(st.nextToken());
            numbers[i] = number;
            sum += number;
            sums[i] = sum;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.valueOf(st.nextToken());
            int end = Integer.valueOf(st.nextToken());
            System.out.println(sums[end] - sums[start - 1]);
        }
    }
}
