package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class KingTest {
    private Piece king = new King(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(Arrays.asList("D6", "D4", "C5", "E5", "C6", "E6", "C4", "E4"), containsInAnyOrder(king.availableMoves("D5").toArray()));
        assertThat(Arrays.asList("A2", "B2", "B1"), containsInAnyOrder(king.availableMoves("A1").toArray()));
        assertThat(Arrays.asList("G8", "H7", "G7"), containsInAnyOrder(king.availableMoves("H8").toArray()));
        assertThat(Arrays.asList("D8", "F8", "D7", "E7", "F7"), containsInAnyOrder(king.availableMoves("E8").toArray()));
    }
}
