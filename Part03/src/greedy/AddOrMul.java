package greedy;

public class AddOrMul {
    public static int solution(String str) {
        int answer = 0;
        for (char ch : str.toCharArray()) {
            int n = Character.getNumericValue(ch);
            if (n == 0 || answer == 0)
                answer += n;
            else
                answer *= n;
        }
        return answer;
    }
}
