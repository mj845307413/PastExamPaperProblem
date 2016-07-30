import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by majun on 16/7/30.
 */
public class StreetLamp {
    public void getMinDistinct() {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        while (in.hasNext()) {
            int n = in.nextInt();
            int l = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            double d = a[0];
            if (n == 1) {
                d = a[0] > l - a[0] ? a[0] : l - a[0];
            } else {
                double dl = l - a[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    if (d <= (a[i + 1] - a[i]) / 2) {
                        d = (a[i + 1] - a[i]) / 2;
                    }
                }
                d = d < dl ? dl : d;
            }
            System.out.println(df.format(d));
        }
    }
}
