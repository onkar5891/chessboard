package rule;

import chessboard.Position;

public class LeftDiagonalUp implements Direction {
    @Override
    public Position next() {
        return new Position(-1, -1);
    }
}
