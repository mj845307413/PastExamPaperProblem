import java.util.*;

/**
 * Created by majun on 16/7/30.
 */
public class ScholarShip {
    public void getScholarShip() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int r = scanner.nextInt();
            int avg = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int sum = 0;
            long time = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
                sum += a[i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (b[j] < b[j - 1]) {
                        int tempB = b[j - 1];
                        b[j - 1] = b[j];
                        b[j] = tempB;
                        int tempA = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = tempA;
                    }
                }
            }
            int k = 0;
            while (sum < n * avg) {
                while (a[k] >= r) {
                    k++;
                }
                sum++;
                a[k]++;
                time += b[k];
            }
            System.out.println(time);
        }
    }
}
