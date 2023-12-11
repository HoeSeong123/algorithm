package 프로그래머스.레벨2.p131130;

import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        List<Integer> cardsList = new ArrayList<>();
        boolean[] isOpen = new boolean[cards.length];

        for(int i = 0; i < cards.length; i++) {
            int count = 0;
            int index = i;
            while(true) {
                if(isOpen[index]) {
                    break;
                }
                isOpen[index] = true;
                index = cards[index] - 1;
                count++;
            }
            cardsList.add(count);
        }

        Collections.sort(cardsList);
        int size = cardsList.size();

        if(size == 1) {
            return 0;
        }

        answer = cardsList.get(size - 2) * cardsList.get(size - 1);
        return answer;
    }
}