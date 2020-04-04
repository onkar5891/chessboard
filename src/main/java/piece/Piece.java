package piece;

import chessboard.Position;
import naming.NamingStrategy;
import rule.Direction;

import java.util.ArrayList;
import java.util.List;

import static chessboard.Chessboard.INVALID_POSITION;

public abstract class Piece {
    protected NamingStrategy namingStrategy;

    public Piece(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    protected List<String> availableMoves(String from) {
        List<String> positions = new ArrayList<>();

        getDirections().forEach(direction -> {
            Position current = namingStrategy.fromRepresentationalString(from);
            for (int i = 1; i <= stepCount(); i++) {
                Position relative = direction.next();
                Position next = current.add(relative);
                if (INVALID_POSITION.test(next)) {
                    break;
                }
                positions.add(namingStrategy.toRepresentationalString(next));
                current = next;
            }
        });

        return positions;
    }

    abstract List<Direction> getDirections();

    abstract int stepCount();
}
