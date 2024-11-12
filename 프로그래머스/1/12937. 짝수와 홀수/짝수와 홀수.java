class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num == 0){       // 0일때
            answer = "Even";
        }if(num%2 == 0){    //2로 나눈 나머지가 0일때
            answer = "Even";
        }else{              //2로 나눈 나머지가 0이 아닐때
            answer = "Odd";
        }
        
        return answer;
    }
}