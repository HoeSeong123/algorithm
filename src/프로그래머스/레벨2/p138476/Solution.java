package 프로그래머스.레벨2.p138476;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        int[] count = new int[10_000_001];

        for(int num : tangerine) {
            count[num]++;
        }

        Arrays.sort(count);

        for(int i = 10_000_000; i >= 0; i--) {
            k -= count[i];
            answer++;
            if(k <= 0) {
                break;
            }
        }
        return answer;
    }
}