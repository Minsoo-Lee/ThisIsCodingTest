package greedy;

import java.util.Arrays;

public class CannotMakeMoney {
    public static int solution(int n, int[] list) {
        Arrays.sort(list);
        int target = 1;
        for (int x : list) {
            if (target < x) {
                break;
            } else {
                target += x;
            }
        }

        return target;
    }
}
