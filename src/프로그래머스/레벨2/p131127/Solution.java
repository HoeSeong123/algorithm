package 프로그래머스.레벨2.p131127;

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantWithNumber = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            wantWithNumber.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++) {
            boolean isOver = false;
            Map<String, Integer> tmp = new HashMap<String, Integer>(wantWithNumber);

            for(int j = 0; j < 10; j++) {
                String menu = discount[i + j];
                if(tmp.containsKey(menu)) {
                    int remainNumber = tmp.get(menu);

                    if(remainNumber == 0) {
                        isOver = true;
                        break;
                    }

                    tmp.put(menu, remainNumber - 1);
                } else {
                    isOver = true;
                    break;
                }

            }

            if(!isOver) {
                answer++;
            }
        }
        return answer;
    }
}
