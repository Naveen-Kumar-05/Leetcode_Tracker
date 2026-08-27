// Last updated: 27/8/2026, 9:57:33 am
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            result.append(Character.toLowerCase(s.charAt(i)));

        }
            return result.toString();

    
    }
}