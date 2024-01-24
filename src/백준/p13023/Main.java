package 백준.p13023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] friendship;
    static boolean[] visited;
    static boolean answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        friendship = new ArrayList[N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++) {
            friendship[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            friendship[num1].add(num2);
            friendship[num2].add(num1);
        }

        for(int i = 0; i < N; i++) {
            dfs(i, 0);
        }

        if(answer) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    private static void dfs(int num, int cnt) {
        if(cnt == 5 || answer) {
            answer = true;
            return;
        }

        ArrayList<Integer> list = friendship[num];

        for(int i = 0; i < list.size(); i++) {
            if(!visited[list.get(i)]) {
                visited[list.get(i)] = true;
                dfs(list.get(i), cnt + 1);
                visited[list.get(i)] = false;
            }
        }
    }
}
