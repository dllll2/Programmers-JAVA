class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int result = 0;
        // 일반항 : xn = x + (n-1)x
        // 첫째항 = x, 공차 = x
        // 일반항 = n*x
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = (long) i * x;
        }             
        return answer;
    }
}
