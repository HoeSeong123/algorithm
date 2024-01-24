package 백준.p2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        answer = 0;

        for(int i = 2; i <= 9; i++) {
            dfs(i, 1);
        }

    }

    private static void dfs(int n, int size) {
        if(!isPrime(n)) {
            return;
        }

        if(size == N) {
            System.out.println(n);
            return;
        }
        for(int i = 0; i <= 9; i++) {
            dfs(n * 10 + i, size+1);
        }
    }
    private static boolean isPrime(int num) {
        for(int i = 2; i <=  Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
