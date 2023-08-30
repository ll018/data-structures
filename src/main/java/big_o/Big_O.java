package big_o;

public class Big_O {

    // O(1) - Single operation
    // Constant, number of ops do not grow when n grows.
    // Worst case it takes 1 op to run
    public static int addItems (int n) {
        return n + n;
    }

    // O(n) - Simple for loop
    // Worst case it takes n times to run
    public static void printItems (int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(n^2) - Nested for loop
    // Worst case it takes n*n times to run
    public static void printItemsO2 (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; i++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
