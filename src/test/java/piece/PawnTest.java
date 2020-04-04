package piece;

import naming.StandardNamingStrategy;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class PawnTest {
    private Piece pawn = new Pawn(new StandardNamingStrategy());

    @Test
    public void shouldFindAvailableMoves() {
        assertThat(Collections.singletonList("C6"), containsInAnyOrder(pawn.availableMoves("C5").toArray()));
        assertThat(Arrays.asList("B3", "B4"), containsInAnyOrder(pawn.availableMoves("B2").toArray()));
    }
}
