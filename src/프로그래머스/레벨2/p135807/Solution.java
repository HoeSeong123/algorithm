package 프로그래머스.레벨2.p135807;

import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        for(int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }

        int resultA = gcdA;
        int resultB = gcdB;

        for(int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] % gcdB == 0) {
                resultB = 0;
            }
            if(arrayB[i] % gcdA == 0) {
                resultA = 0;
            }
        }

        answer = Math.max(resultA, resultB);

        return answer;
    }

    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}