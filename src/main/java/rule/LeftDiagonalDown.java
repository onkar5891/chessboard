package rule;

import chessboard.Position;

public class LeftDiagonalDown implements Direction {
    @Override
    public Position next() {
        return new Position(1, -1);
    }
}
