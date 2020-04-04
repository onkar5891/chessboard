package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class QueenTest {
    private Piece queen = new Queen(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(
            Arrays.asList("A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "B2", "C3", "D4", "E5", "F6", "G7", "H8"),
            containsInAnyOrder(queen.availableMoves("A1").toArray())
        );
    }
}
