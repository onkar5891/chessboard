package rule;

import chessboard.Position;

@FunctionalInterface
public interface Direction {
    Position next();
}
