class Solution {
    public int solution(int n) {
        int answer = 0;
        //나눠서 나머지가 1인경우
        int x = 0;
        for(x=1; x<n; x++){
            if(n % x == 1){
                answer = x;
                break;
            }
        }
       return answer;
    }
}