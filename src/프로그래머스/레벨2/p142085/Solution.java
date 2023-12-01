package 프로그래머스.레벨2.p142085;

import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> -(o1 - o2));
        int remain = n;
        int cnt = 0;

        for(int i = 0; i < enemy.length; i++) {
            pq.add(enemy[i]);
            remain -= enemy[i];

            if(remain < 0) {
                if(cnt < k) {
                    remain += pq.poll();
                    cnt++;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}