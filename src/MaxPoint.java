import java.util.Scanner;

/**
 * Created by majun on 16/7/30.
 */
public class MaxPoint {
    public void getmaxPoint(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int[] nums = new int[num1];
            for (int i = 0; in.hasNext() && i < num1; i++) {
                nums[i] = in.nextInt();
            }
            for (int i = 0; in.hasNext() && i < num2; i++) {
                String s = in.next();
                int q1 = in.nextInt();
                int q2 = in.nextInt();
                changeNum(nums, s, q1, q2);
            }
        }
    }

    public static void changeNum(int[] ints, String s, int q1, int q2) {
        int begin, end;
        if (s.equals("Q")) {
            begin = Math.min(q1, q2) - 1;
            end = Math.max(q1, q2);
            int max = ints[begin];
            for (int i = begin; i < end; i++) {
                if (max < ints[i]) {
                    max = ints[i];
                }
            }
            System.out.print(max);
        } else if (s.equals("U")) {
            q1 = q1 - 1;
            ints[q1] = q2;
        }
    }


    private static void process(String c, int a, int b, int[] score) {
        int begin, end;

        if (c.equals("Q")) {
            end = Math.max(a, b);
            begin = Math.min(a, b) - 1;
            int max = score[begin];
            for (int i = begin; i < end; i++) {
                if (max < score[i]) {
                    max = score[i];
                }
            }
            System.out.println(max);
        } else if (c.equals("U")) {
            score[a - 1] = b;
        }
    }
}
