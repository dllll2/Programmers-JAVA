import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        char[] charArray = str.toCharArray();
        int[] intArray = new int[charArray.length];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        
        for (int j = 0; j < intArray.length; j++){
                sum += intArray[j];
        }
        
        System.out.println(sum);
        
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}