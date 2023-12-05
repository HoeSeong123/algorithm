package 프로그래머스.레벨2.p134239;

import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> height = new ArrayList<>();
        height.add(k);

        while(k != 1) {
            if(k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            height.add(k);
        }

        int n = height.size() - 1;

        for(int i = 0; i < ranges.length; i++) {
            int a = ranges[i][0];
            int b = n + ranges[i][1];

            if(a > b) {
                answer[i] = -1;
                continue;
            }

            int tmp = 0;
            for(int j = a; j <= b; j++) {
                tmp += height.get(j) * 2;
            }
            answer[i] = (double) (tmp - height.get(a) - height.get(b)) / 2;
        }
        return answer;
    }
}
