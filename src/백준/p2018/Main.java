package 백준.p2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());

        int start = 1;
        int end = 1;
        int answer = 0;

        while(true) {
            if(start == N && end == N) {
                answer++;
                break;
            }
            int sum = 0;
            for(int i = start; i <= end; i++) {
                sum += i;
            }

            if(sum > N) {
                sum -= start;
                start++;
            } else if(sum < N) {
                end++;
                sum += end;
            } else if(sum == N) {
                end++;
                sum += end;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
