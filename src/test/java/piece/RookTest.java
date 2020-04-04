package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class RookTest {
    private Piece rook = new Rook(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(
            Arrays.asList("D6", "D7", "D8", "E5", "F5", "G5", "H5", "D4", "D3", "D2", "D1", "C5", "B5", "A5"),
            containsInAnyOrder(rook.availableMoves("D5").toArray())
        );
    }
}
