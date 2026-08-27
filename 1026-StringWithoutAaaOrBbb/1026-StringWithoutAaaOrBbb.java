// Last updated: 27/8/2026, 9:57:24 am
class Solution {
    public String strWithout3a3b(int a, int b) {

        StringBuilder ans = new StringBuilder();

        while (a > 0 || b > 0) {

            if (a > b) {

                if (a > 1) {
                    ans.append("aa");
                    a -= 2;
                } else {
                    ans.append("a");
                    a--;
                }

                if (b > 0) {
                    ans.append("b");
                    b--;
                }

            } else if (b > a) {

                if (b > 1) {
                    ans.append("bb");
                    b -= 2;
                } else {
                    ans.append("b");
                    b--;
                }

                if (a > 0) {
                    ans.append("a");
                    a--;
                }

            } else {

                if (a > 0) {
                    ans.append("ab");
                    a--;
                    b--;
                }
            }
        }

        return ans.toString();
    }
}