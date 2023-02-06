package implement;

public class LuckyStraight {
    public static String solution(int n) {
        char[] charArr = Integer.toString(n).toCharArray();
        int len = charArr.length;
        int right = 0;
        int left = 0;

        for (int i = 0; i < len / 2; i++) {
            right += Character.getNumericValue(charArr[i]);
            left += Character.getNumericValue(charArr[len - i - 1]);
        }
        return right == left ? "LUCKY" : "READY";
    }
}
