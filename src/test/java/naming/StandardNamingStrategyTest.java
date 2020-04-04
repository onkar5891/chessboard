package naming;

import chessboard.Position;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StandardNamingStrategyTest {
    private NamingStrategy namingStrategy = new StandardNamingStrategy();

    @Test
    public void shouldNotIdentifyInvalidCellName() {
        int count = 0;
        List<Position> invalidPositions = Arrays.asList(new Position(-1, 0), new Position(8, 5), new Position(10, 12));

        for (Position from : invalidPositions) {
            try {
                namingStrategy.toRepresentationalString(from);
            } catch (IllegalArgumentException e) {
                count++;
            }
        }
        assertEquals(invalidPositions.size(), count);
    }

    @Test
    public void shouldIdentifyCellName() {
        assertEquals("A5", namingStrategy.toRepresentationalString(new Position(3, 0)));
        assertEquals("D8", namingStrategy.toRepresentationalString(new Position(0, 3)));
        assertEquals("E1", namingStrategy.toRepresentationalString(new Position(7, 4)));
    }

    @Test
    public void shouldNotIdentifyInvalidCellPosition() {
        int count = 0;
        String[] invalidPositions = new String[] { "A9", "Z2", "X9" };

        for (String from : invalidPositions) {
            try {
                namingStrategy.fromRepresentationalString(from);
            } catch (IllegalArgumentException e) {
                count++;
            }
        }
        assertEquals(invalidPositions.length, count);
    }

    @Test
    public void shouldIdentifyCellPosition() {
        assertEquals(new Position(5, 5), namingStrategy.fromRepresentationalString("F3"));
        assertEquals(new Position(2, 2), namingStrategy.fromRepresentationalString("C6"));
        assertEquals(new Position(4, 1), namingStrategy.fromRepresentationalString("B4"));
    }
}
