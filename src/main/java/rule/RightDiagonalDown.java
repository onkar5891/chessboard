package rule;

import chessboard.Position;

public class RightDiagonalDown implements Direction {
    @Override
    public Position next() {
        return new Position(1, 1);
    }
}
