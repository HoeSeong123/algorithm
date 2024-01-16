package 백준.p17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[N];

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                answer[stack.pop()] = nums[i];
            }
            stack.add(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        for(int i = 0; i < N; i++) {
            bw.write(answer[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
