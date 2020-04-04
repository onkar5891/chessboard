package rule;

import chessboard.Position;

public class VerticalUp implements Direction {
    @Override
    public Position next() {
        return new Position(-1, 0);
    }
}
