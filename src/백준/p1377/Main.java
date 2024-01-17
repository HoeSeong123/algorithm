package 백준.p1377;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Node[] nums = new Node[N];

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = new Node(num, i);
        }

        Arrays.sort(nums);
        int max = 0;

        for(int i = 0; i < N; i++) {
            max = Math.max(max, nums[i].index - i);
        }

        System.out.println(max + 1);
    }

    static class Node implements Comparable<Node> {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }
    }
}
