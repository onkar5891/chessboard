package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class KnightTest {
    private Piece knight = new Knight(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(Arrays.asList("C4", "D5", "F5", "G4", "G2", "F1", "D1", "C2"), containsInAnyOrder(knight.availableMoves("E3").toArray()));
    }
}
