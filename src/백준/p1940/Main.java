package 백준.p1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        int M = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(nums);

        int start = 0;
        int end = N - 1;
        int answer = 0;

        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum < M) {
                start++;
            } else if(sum > M) {
                end--;
            } else if(sum == M) {
                answer++;
                start++;
                end--;
            }
        }

        System.out.println(answer);
    }
}
