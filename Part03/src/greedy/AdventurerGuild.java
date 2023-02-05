package greedy;

import java.util.Arrays;
import java.util.Collections;

public class AdventurerGuild {

    public static int solution(int n, int[] people) {
        int answer = 0;
        int count = n - 1;
        Arrays.sort(people);
        while (count >= 0) {
            int most = people[count];
            for (int i = 0; i < most; i++) {
                if (count < 0) {
                    break;
                } else {
                    count--;
                }
            }
            answer++;
        }
        return answer;
    }
}
