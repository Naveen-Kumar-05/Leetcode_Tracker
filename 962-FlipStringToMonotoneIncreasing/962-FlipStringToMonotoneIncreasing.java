// Last updated: 27/8/2026, 9:57:27 am
class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones =0;
        int flip=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ones++;
            }else{
                flip=Math.min(flip+1,ones);
            }
        }
        return flip;
    }
}