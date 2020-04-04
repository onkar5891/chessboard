package naming;

import chessboard.Position;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import static chessboard.Chessboard.INVALID_POSITION;
import static java.text.MessageFormat.format;

public class StandardNamingStrategy implements NamingStrategy {
    private static final int[] ROWS = { 8, 7, 6, 5, 4, 3, 2, 1 };
    private static final Character[] COLUMNS = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

    @Override
    public String toRepresentationalString(Position from) {
        requiredValid(from);
        return format("{0}{1}", COLUMNS[from.getJ()], ROWS[from.getI()]);
    }

    @Override
    public Position fromRepresentationalString(String from) {
        requiredValid(from);

        int row = ROWS.length - (from.charAt(1) - 48);
        int column = Arrays.stream(COLUMNS).collect(Collectors.toMap(Function.identity(), ch -> (int) (ch - 65))).getOrDefault(from.charAt(0), -1);

        Position position = new Position(row, column);
        requiredValid(position);

        return position;
    }

    private void requiredValid(Position position) {
        if (INVALID_POSITION.test(position)) {
            throw new IllegalArgumentException("Encountered invalid position..");
        }
    }

    private void requiredValid(String position) {
        if (position.length() < 2) {
            throw new IllegalArgumentException("Encountered invalid position..");
        }
    }
}
