package greedy;

import java.util.Arrays;

public class ReverseString {
    public static int solution(String str) {
        int count0 = 0;
        int count1 = 0;
        char[] ch = str.toCharArray();

        if (ch[0] == '1')
            count0++;
        else
            count1++;

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != ch[i + 1]) {
                if (ch[i + 1] == '1')
                    count0++;
                else
                    count1++;
            }
        }
        return Math.min(count0, count1);
    }
}
