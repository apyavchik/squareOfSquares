public class SquareOfSquares {
    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            return true;
        } else if (n > 0 && Math.sqrt(n) % 1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
