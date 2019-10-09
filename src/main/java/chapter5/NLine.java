package chapter5;

public class NLine {
    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }
    // nLines |[4]|
    // nLines |[3]|
    // nLines |[2]|
    // nLines |[1]|

}
