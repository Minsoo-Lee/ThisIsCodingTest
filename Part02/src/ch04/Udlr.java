package ch04;

public class Udlr {
    private final static int[] toX = {-1, 1, 0, 0};
    private final static int[] toY = {0, 0, -1, 1};
    private final static char[] dirArr = {'U', 'D', 'L', 'R'};

    public static int[] solution(int n, char[] map) {
        int x = 1;
        int y = 1;

        for (char dir : map) {
            int move = 0;
            for (int i = 0; i < 4; i++) {
                if (dirArr[i] == dir) {
                    int tmpX = x + toX[i];
                    int tmpY = y + toY[i];
                    if (tmpX <= n && tmpX >= 1 && tmpY <= n && tmpY >= 1) {
                        x = tmpX;
                        y = tmpY;
                    }
                    break;
                }
            }
        }
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
}
