/**
 * Created by majun on 16/7/21.
 */
public class CalculateMax {
    public int calculateMax(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            int firstCount=0;
            if (prices[i]<min)
            {
                min=prices[i];
                continue;
            }
            if (prices[i] > min) {
                firstCount = (prices[i] - min);
                int secondCount=0;
                if (prices.length>i+2)
                {
                    int secondMin=prices[i+1];
                    for (int j=i+2;j<prices.length;j++)
                    {
                        if (prices[j]<secondMin)
                        {
                            secondMin=prices[j];
                            continue;
                        }
                        if ((prices[j]-secondMin)>secondCount)
                        {
                            secondCount=prices[j]-secondMin;
                        }
                    }
                }
                if (count<firstCount+secondCount)
                {
                    count=firstCount+secondCount;
                }
            }
        }
        return count;
    }
}
