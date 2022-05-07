public class StockBuy_maxProfit_1 {
    int maxProfit(int a[]) {
        int maxProfit = 0;
        int minSofar = a[0];

        for (int i = 0; i < a.length; i++) {
            minSofar = Math.min(minSofar, a[i]);
            int Profit = a[i] - minSofar;
            maxProfit = Math.max(maxProfit, Profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {

    }
}
