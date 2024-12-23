import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        System.out.println(str);
        
        char[] a = str.toCharArray();
        
        java.util.Arrays.sort(a);
        
        StringBuilder sortedStr = new StringBuilder(new String(a));
        sortedStr.reverse(); 
        
        long answer = Long.parseLong(sortedStr.toString());
        
        System.out.println("정렬된 문자열: " + sortedStr);
        
        return answer;
    }
}