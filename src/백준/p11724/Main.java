package 백준.p11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] list = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];

        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            list[num1].add(num2);
            list[num2].add(num1);
        }

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for(int i = 1; i <= N; i++) {
            if(visited[i]) {
                continue;
            }
            stack.add(i);
            visited[i] = true;

            while (!stack.isEmpty()) {
                int num = stack.pop();

                for (int j = 0; j < list[num].size(); j++) {
                    int tmpNum = list[num].get(j);
                    if (!visited[tmpNum]) {
                        stack.add(list[num].get(j));
                        visited[tmpNum] = true;
                    }
                }
            }

            answer++;
        }

        System.out.println(answer);
    }
}
