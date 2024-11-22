class Solution {
    public int[] solution(long n) {
        String nString = String.valueOf(n);
        int[] answer = new int[nString.length()];
        for (int i = 0; i < nString.length(); i++) {
            answer[i] = nString.charAt(nString.length() - 1 - i) - '0';
        }
        return answer;
    }
}