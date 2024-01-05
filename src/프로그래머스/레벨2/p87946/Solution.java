package 프로그래머스.레벨2.p87946;

class Solution {
    private boolean[] visited;
    private int max;

    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        visited = new boolean[dungeons.length];
        max = 0;

        answer = dfs(k, dungeons, 0);

        return answer;
    }

    private int dfs(int k, int[][] dungeons, int count) {
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i] || dungeons[i][0] > k) {
                continue;
            }
            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, count + 1);
            visited[i] = false;
        }

        max = Math.max(count, max);

        return max;
    }
}