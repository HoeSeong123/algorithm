package 백준.p1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] nums = new long[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Long.valueOf(st.nextToken());
        }

        Arrays.sort(nums);
        int answer = 0;

        for(int i = 0; i < N; i++) {
            long num = nums[i];

            int start = 0;
            int end = N - 1;

            while(start < end) {
                long sum = nums[start] + nums[end];

                if(sum < num) {
                    start++;
                } else if(sum > num) {
                    end--;
                } else {
                    if(start != i && end != i) {
                        answer++;
                        break;
                    } else if(start == i) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
