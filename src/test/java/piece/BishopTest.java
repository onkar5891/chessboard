package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class BishopTest {
    private Piece bishop = new Bishop(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(Arrays.asList("B2", "C3", "D4", "E5", "F6", "G7", "H8"), containsInAnyOrder(bishop.availableMoves("A1").toArray()));
        assertThat(Arrays.asList("C5", "B6", "A7", "E5", "F6", "G7", "H8", "E3", "F2", "G1", "C3", "B2", "A1"), containsInAnyOrder(bishop.availableMoves("D4").toArray()));
        assertThat(Arrays.asList("G2", "F3", "E4", "D5", "C6", "B7", "A8"), containsInAnyOrder(bishop.availableMoves("H1").toArray()));
        assertThat(Arrays.asList("D7", "C6", "B5", "A4", "F7", "G6", "H5"), containsInAnyOrder(bishop.availableMoves("E8").toArray()));
    }
}
