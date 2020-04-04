package piece;

import naming.NamingStrategy;
import rule.*;

import java.util.Arrays;
import java.util.List;

import static chessboard.Chessboard.MAX_STEPS;

public class Rook extends Piece {
    public Rook(NamingStrategy namingStrategy) {
        super(namingStrategy);
    }

    @Override
    List<Direction> getDirections() {
        return
            Arrays.asList(
                new VerticalUp(),
                new HorizontalRight(),
                new VerticalDown(),
                new HorizontalLeft()
            );
    }

    @Override
    int stepCount() {
        return MAX_STEPS;
    }
}
