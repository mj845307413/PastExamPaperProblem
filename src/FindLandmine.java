import java.util.Scanner;

/**
 * Created by majun on 16/7/30.
 */
public class FindLandmine {
    public void findLandmineFunc() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            int M = in.nextInt();
            int k = in.nextInt();
            int[][] a = new int[N][M];
            for (int i = 0; i < k; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                if (a[x - 1][y - 1] != 0) {
                    a[x - 1][y - 1]++;
                } else {
                    a[x - 1][y - 1] = 1;
                }
            }
            int max1 = getMax(a, N, M);
            int max2 = getMax(a, N, M);
            System.out.println(max1 + max2);
        }
    }

    public static int getMax(int[][] a, int N, int M) {
        int x = 0;
        int y = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int count = 0;
                if (a[i][j] > 0) {
                    count++;
                }
                if (i - 1 >= 0) {
                    if (a[i - 1][j] > 0) {
                        count++;
                    }
                    if (j - 1 >= 0) {
                        if (a[i - 1][j - 1] > 0) {
                            count++;
                        }
                    }
                    if (j + 1 < M) {
                        if (a[i - 1][j + 1] > 0) {
                            count++;
                        }
                    }
                }
                if (j - 1 >= 0) {
                    if (a[i][j - 1] > 0) {
                        count++;
                    }
                }
                if (j + 1 < M) {
                    if (a[i][j + 1] > 0) {
                        count++;
                    }
                }
                if (i + 1 < N) {
                    if (a[i + 1][j] > 0) {
                        count++;
                    }
                    if (j - 1 >= 0) {
                        if (a[i + 1][j - 1] > 0) {
                            count++;
                        }
                    }
                    if (j + 1 < M) {
                        if (a[i + 1][j + 1] > 0) {
                            count++;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                    x = i;
                    y = j;
                }
            }
        }
        isLandmine(a, x, y);
        if (x - 1 >= 0) {
            isLandmine(a, x, y);
            if (y - 1 >= 0) {
                isLandmine(a, x - 1, y - 1);
            }
            if (y + 1 < M) {
                isLandmine(a, x - 1, y + 1);
            }
        }
        if (y - 1 >= 0) {
            isLandmine(a, x, y - 1);
        }
        if (y + 1 < M) {
            isLandmine(a, x, y + 1);
        }
        if (x + 1 < N) {
            isLandmine(a, x + 1, y);
            if (y - 1 >= 0) {
                isLandmine(a, x + 1, y - 1);
            }
            if (y + 1 < M) {
                isLandmine(a, x + 1, y + 1);
            }
        }
        return max;
    }


    public static void isLandmine(int[][] a, int x, int y) {
        if (a[x][y] > 0) {
            a[x][y]--;
        }
    }
}
