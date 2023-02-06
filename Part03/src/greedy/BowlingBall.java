package greedy;

public class BowlingBall {
    public static int solution(int n, int m, int[] list) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[i] == list[j]) {
                    continue;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
