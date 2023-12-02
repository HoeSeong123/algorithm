package 프로그래머스.레벨2.p140107;

class Solution {
    public long solution(int k, int d) {
        long answer = 0;

        for(int i = 0; i <= d; i += k) {
            long r = (long) d * d;
            long x = (long) i * i;

            int y = (int) Math.sqrt(r - x);

            answer += y / k + 1;
        }
        return answer;
    }
}