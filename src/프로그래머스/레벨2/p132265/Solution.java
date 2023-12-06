package 프로그래머스.레벨2.p132265;

import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> aMap = new HashMap<>();
        Map<Integer, Integer> bMap = new HashMap<>();

        aMap.put(topping[0], 1);

        for(int i = 1; i < topping.length; i++) {
            bMap.put(topping[i], bMap.getOrDefault(topping[i], 0) + 1);
        }

        for(int i = 1; i < topping.length; i++) {
            if(aMap.size() == bMap.size()) {
                answer++;
            }

            aMap.put(topping[i], aMap.getOrDefault(topping[i], 0) + 1);
            bMap.put(topping[i], bMap.get(topping[i]) - 1);

            if(bMap.get(topping[i]) == 0) {
                bMap.remove(topping[i]);
            }

        }
        return answer;
    }
}
