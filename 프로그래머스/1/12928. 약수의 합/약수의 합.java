import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        // n 을 나눈 나머지가 0인것만 리스트에 저장
        List<Integer> intList = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                intList.add(i);
            }
        }
        
        for(int j = 0; j<intList.size();j++){
            answer += intList.get(j);
        }
        return answer;
    }
}