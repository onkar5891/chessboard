package piece;

import naming.NamingStrategy;
import rule.*;

import java.util.Arrays;
import java.util.List;

import static chessboard.Chessboard.MIN_STEPS;

public class King extends Piece {
    public King(NamingStrategy namingStrategy) {
        super(namingStrategy);
    }

    @Override
    List<Direction> getDirections() {
        return
            Arrays.asList(
                new LeftDiagonalUp(),
                new VerticalUp(),
                new RightDiagonalUp(),
                new HorizontalRight(),
                new RightDiagonalDown(),
                new VerticalDown(),
                new LeftDiagonalDown(),
                new HorizontalLeft()
            );
    }

    @Override
    int stepCount() {
        return MIN_STEPS;
    }
}
