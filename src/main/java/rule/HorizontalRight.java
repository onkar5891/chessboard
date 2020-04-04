package rule;

import chessboard.Position;

public class HorizontalRight implements Direction {
    @Override
    public Position next() {
        return new Position(0, 1);
    }
}
