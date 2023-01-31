package ch04;

import java.util.Arrays;

public class Knight {
    public static final int[][] dir = {{2, 1}, {-2, -1}, {-2, 1}, {2, -1}, {1, 2}, {-1, -2}, {1, -2}, {-1, 2}};
    public static final String col = "abcdefgh";
    public static int solution(String str) {
        int count = 0;
        int[] check = new int[2];
        check[0] = col.indexOf(str.toCharArray()[0]) + 1;
        check[1] = Character.getNumericValue(str.toCharArray()[1]);

        for (int[] tmp : dir) {
            if (tmp[0] + check[0] < 1 || tmp[0] + check[0] > 8)
                continue;
            else if (tmp[1] + check[1] < 1 || tmp[1] + check[1] > 8)
                continue;
            else
                count++;
        }
        return count;
    }
}
