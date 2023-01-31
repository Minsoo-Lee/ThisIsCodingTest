package ch03;

public class Change {
    public static int solution(int n) {
        int count = 0;

        int[] list = {500, 100, 50, 10};

        for (int coin : list) {
            count += n / coin;
            n %= coin;
        }
        return count;
    }
}
