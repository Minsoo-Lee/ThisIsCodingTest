package ch03;

import java.util.Arrays;

public class NumberCardGame {
    public static int solution(int n, int m, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int min = Arrays.stream(arr[i]).min().getAsInt();
            if (min > max)
                max = min;
        }
        return max;
    }
}
