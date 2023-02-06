package implement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealignString {
    public static String solution(String str) {
        char[] charArr = str.toCharArray();
        List<Character> result = new ArrayList<>();
        int num = 0;

        Arrays.sort(charArr);
        for (char ch : charArr) {
            if (Character.isDigit(ch))
                num += Character.getNumericValue(ch);
            else
                result.add(ch);
        }

        StringBuilder answer = new StringBuilder();
        for (char ch : result) {
            answer.append(Character.toString(ch));
        }
        answer.append(Integer.toString(num));
        return answer.toString();
    }
}
