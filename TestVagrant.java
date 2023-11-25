public class TestVagrant {
    public static void main(String[] args) {
        int[] unitPrice = { 1100, 900, 200, 100 };
        int[] GSTpercent = { 18, 12, 28, 0 };
        int[] quantity = { 1, 4, 3, 2 };
        int[] GSTPrice = new int[4];
        for (int i = 0; i < 4; i++) {
            GSTPrice[i] = (unitPrice[i] * GSTpercent[i]) / 100 * quantity[i];
            System.out.println("GST price for item " + (i + 1) + " : " + GSTPrice[i]);
        }
        int max = 0;
        int item = 0;
        for (int i = 0; i < 4; i++) {
            if (GSTPrice[i] > max) {
                max = GSTPrice[i];
                item = i;
            }
        }
        System.out.println(
                "\n\nQuestion 1. Maximum GST amount paid is for item " + (item + 1) + ". And paid amount is : " + max);
        int[] total = new int[4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            total[i] = unitPrice[i] * quantity[i] + GSTPrice[i];
            sum += total[i];
        }
        System.out.println("\n\nAmounts to be paid for each item listed below ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Amount to be paid for item " + (i + 1) + " is : " + total[i]);
        }
        System.out.println("\n\nQuestion 2. Total amount to be paid = " + sum);
    }
}