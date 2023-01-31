package Part02.Ch03_Greedy;

public class Change {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;

        // 큰 단위의 화폐부터 차례대로 확인
        int[] list = {500, 100, 50, 10};
        for (int coin : list) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }
}