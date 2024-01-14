package 백준.p10986;

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
        long[] sum = new long[N];

        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.valueOf(st.nextToken());

        for(int i = 1; i < N; i++) {
            int number = Integer.valueOf(st.nextToken());
            sum[i] = sum[i - 1] + number;
        }

        long answer = 0;
        long[] remains = new long[M];

        for(int i = 0; i < N; i++) {
            int remain = (int) (sum[i] % M);
            if(remain == 0) {
                answer++;
            }
            remains[remain]++;
        }

        for(int i = 0; i < M; i++) {
            if(remains[i] > 1) {
                answer += remains[i] * (remains[i] - 1) / 2;
            }
        }

        System.out.println(answer);
    }
}
