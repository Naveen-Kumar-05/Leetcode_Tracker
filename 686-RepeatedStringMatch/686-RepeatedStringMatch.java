// Last updated: 27/8/2026, 9:57:36 am
class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.toString().contains(b)) {
            return count;
        }

        sb.append(a);
        count++;

        if (sb.toString().contains(b)) {
            return count;
        }

        return -1;
    }
}