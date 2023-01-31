package ch03;

import java.util.Arrays;

public class BigNumber {
    public static int solution(int size, int m, int k, int[] list) {
        Arrays.sort(list);
        int first = list[size - 1];
        int second = list[size - 2];
        int result = 0;

        while (true) {
            for (int i = 0; i < k; i++) {
                if (m-- == 0)
                    return result;
                result += first;
            }
            if (m-- == 0)
                return result;
            result += second;
        }
    }
}
