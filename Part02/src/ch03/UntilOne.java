package ch03;

public class UntilOne {
    public static int solution(int n, int k) {
        int count = 0;
        while (n != 1) {
            if (n % k == 0)
                n /= k;
            else
                n -= 1;
            count++;
        }
        return count;
    }
}
