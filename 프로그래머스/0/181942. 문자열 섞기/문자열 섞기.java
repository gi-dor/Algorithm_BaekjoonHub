class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
    
        // str1의길이 = str2의 길이
        int num =  str1.length();
        
        for(int i =0; i < num; i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}