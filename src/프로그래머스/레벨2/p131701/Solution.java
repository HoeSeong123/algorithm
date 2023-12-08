package 프로그래머스.레벨2.p131701;

import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] elementTwice = new int[elements.length * 2];

        for(int i = 0; i < elements.length; i++) {
            elementTwice[i] = elements[i];
            elementTwice[i + elements.length] = elements[i];
        }

        Set<Integer> result = new HashSet<>();
        for(int i = 0; i < elements.length; i++) {
            int sum = 0;
            for(int j = 0; j < elements.length; j++) {
                sum += elementTwice[i + j];
                result.add(sum);
            }
        }

        answer = result.size();

        return answer;
    }
}