package rule;

import chessboard.Position;

public class HorizontalLeft implements Direction {
    @Override
    public Position next() {
        return new Position(0, -1);
    }
}
