package 프로그래머스.레벨2.p131704;

import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < order.length; i++) {
            queue.add(i + 1);
        }

        int i = 0;

        while(true) {
            boolean flag = false;
            if(!queue.isEmpty() && order[i] == queue.peek()) {
                queue.poll();
                answer++;
                i++;
                flag = true;
                continue;
            }

            if(!stack.isEmpty() && order[i] == stack.peek()) {
                stack.pop();
                answer++;
                i++;
                flag = true;
                continue;
            }

            if(!queue.isEmpty()) {
                stack.add(queue.poll());
                flag = true;
            }

            if(!flag) {
                break;
            }
        }
        return answer;
    }
}