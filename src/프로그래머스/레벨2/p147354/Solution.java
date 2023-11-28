package 프로그래머스.레벨2.p147354;

import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int compareResult = Integer.compare(o1[col - 1], o2[col - 1]);

                if (compareResult == 0) {
                    return Integer.compare(o2[0], o1[0]);
                }

                return compareResult;
            }
        });

        List<Integer> S = new ArrayList<>();

        for(int i = row_begin; i <= row_end; i++) {
            int S_i = 0;
            for(int j = 0; j < data[i - 1].length; j++) {
                S_i += data[i - 1][j] % i;
            }

            S.add(S_i);
        }

        if(S.size() < 2) {
            return S.get(0);
        }

        int result = S.get(0);

        for(int i = 1; i < S.size(); i++) {
            result = result ^ S.get(i);
        }

        return result;
    }
}