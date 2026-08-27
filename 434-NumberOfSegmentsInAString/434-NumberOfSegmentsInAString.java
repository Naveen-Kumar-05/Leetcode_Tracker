// Last updated: 27/8/2026, 9:57:44 am
class Solution {
    public int countSegments(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}