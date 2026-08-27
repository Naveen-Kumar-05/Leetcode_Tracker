// Last updated: 27/8/2026, 9:57:53 am
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] n=s.toCharArray();
        char[] a=t.toCharArray();
        Arrays.sort(n);
        Arrays.sort(a);
        if(Arrays.equals(n,a)){
            return true;


        }else{
            return false;
        }
    }
}


        
    