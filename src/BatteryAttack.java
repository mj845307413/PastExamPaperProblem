import java.util.Scanner;

/**
 * 兰博教训提莫之后,然后和提莫讨论起约德尔人,谈起约德尔人,自然少不了一个人,那 就是黑默丁格------约德尔人历史上最伟大的科学家. 提莫说,黑默丁格最近在思考一个问题:黑默丁格有三个炮台,炮台能攻击到距离它R的敌人 (两点之间的距离为两点连续的距离,例如(3,0),(0,4)之间的距离是5),如果一个炮台能攻击 到敌人,那么就会对敌人造成1×的伤害.黑默丁格将三个炮台放在N*M方格中的点上,并且给出敌人 的坐标. 问:那么敌人受到伤害会是多大?
 * Created by majun on 16/7/30.
 */
public class BatteryAttack {
    public void batterAttackFunc() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int R = in.nextInt();
            int[] x = new int[4];
            int[] y = new int[4];
            int count = 0;
            for (int i = 0; i < 4; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                int n = (int) (Math.pow(x[i] - x[3], 2) + Math.pow(y[i] - y[3], 2));
                int d = (int) (Math.pow(R, 2));
                if (n <= d) {
                    count++;
                }
            }
            System.out.println(count + "x");
        }
    }
}
