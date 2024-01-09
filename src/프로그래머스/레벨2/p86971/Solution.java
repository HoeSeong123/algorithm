package 프로그래머스.레벨2.p86971;

import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 100;
        Map<Integer, List<Integer>> linkedWires = new HashMap<>();



        for(int i = 0; i < wires.length; i++) {
            for(int j = 0; j < n; j++) {
                linkedWires.put(j + 1, new ArrayList<>());
            }
            for(int j = 0; j < wires.length; j++) {
                if(i == j) continue;

                int num1 = wires[j][0];
                int num2 = wires[j][1];
                List<Integer> tmpList1 = linkedWires.get(num1);
                List<Integer> tmpList2 = linkedWires.get(num2);

                tmpList1.add(num2);
                tmpList2.add(num1);

                linkedWires.put(num1, tmpList1);
                linkedWires.put(num2, tmpList2);
            }

            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[n + 1];
            List<Integer> cnts = new ArrayList<>();

            for(int j = 1; j < n + 1; j++) {
                if(visited[j]) continue;

                queue.add(j);
                int cnt = 0;

                while(!queue.isEmpty()) {
                    int num = queue.poll();
                    visited[num] = true;
                    List<Integer> list = linkedWires.get(num);
                    for(int wire : list) {
                        if(visited[wire]) continue;
                        queue.add(wire);
                    }
                    cnt++;
                }
                cnts.add(cnt);
            }

            int diff = Math.abs(cnts.get(0) - cnts.get(1));
            answer = Math.min(answer, diff);
        }


        return answer;
    }
}