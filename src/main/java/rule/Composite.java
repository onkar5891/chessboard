package rule;

import chessboard.Position;

import java.util.Arrays;
import java.util.List;

public class Composite implements Direction {
    private final List<Direction> directions;

    public Composite(Direction... directions) {
        this.directions = Arrays.asList(directions);
    }

    @Override
    public Position next() {
        Position position = new Position(0, 0);
        for (Direction direction : directions) {
            position = position.add(direction.next());
        }
        return position;
    }
}
