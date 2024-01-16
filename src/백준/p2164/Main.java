package 백준.p2164;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;
        while(true) {
            if(queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }

            if(cnt % 2 == 1) {
                queue.poll();
            } else {
                queue.add(queue.poll());
            }

            cnt++;
        }
    }
}
