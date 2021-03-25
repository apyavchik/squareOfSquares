import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareOfSquaresTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, SquareOfSquares.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   SquareOfSquares.isSquare(0));
        assertEquals("3 isn't a square number", false,  SquareOfSquares.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   SquareOfSquares.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   SquareOfSquares.isSquare(25));
        assertEquals("26 isn't a square number",false,  SquareOfSquares.isSquare(26));
    }
}