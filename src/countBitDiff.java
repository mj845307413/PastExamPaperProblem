/**
 * Created by majun on 16/7/21.
 */
public class CountBitDiff {
    public int countBitDiff(int m, int n) {
        int num=1;
        int count=0;
        for (int i=0;i<32;i++){
            int num1=m&num;
            int num2=n&num;
            if (num1!=num2)
            {
                count++;
            }
            num=num<<1;
        }
        return count;
    }
}
