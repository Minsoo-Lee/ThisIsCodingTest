package greedy;

import java.util.Arrays;

public class MuziMeokBang {
    public static int solution(int k, int[] foodTime) {
        int answer = 0;
        int count = 0;
        int sec = 0;
        int len = foodTime.length;

        while (sec < k) {
            if (Arrays.stream(foodTime).sum() == 0)
                return -1;
            if (foodTime[sec % len] == 0)
                sec++;
            if (foodTime[sec % len] != 0)
                foodTime[(sec++) % len]--;
        }
        return (sec % len) + 1;
    }
}
