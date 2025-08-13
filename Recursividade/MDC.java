package Recursividade;

public class MDC {

    public static int MDC(int x, int y) {
        if (y <= x && x % y == 0) {
            return y;
        } else if (x < y) {
            return MDC(y, x);
        }
        else {
            return MDC(y, x % y);
        }
    }

    public static void main(String[] args) {
        System.out.println(MDC(8, 4));
    }
}
