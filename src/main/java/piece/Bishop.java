package piece;

import naming.NamingStrategy;
import rule.*;

import java.util.Arrays;
import java.util.List;

import static chessboard.Chessboard.MAX_STEPS;

public class Bishop extends Piece {
    public Bishop(NamingStrategy namingStrategy) {
        super(namingStrategy);
    }

    @Override
    List<Direction> getDirections() {
        return
            Arrays.asList(
                new LeftDiagonalUp(),
                new RightDiagonalUp(),
                new RightDiagonalDown(),
                new LeftDiagonalDown()
            );
    }

    @Override
    int stepCount() {
        return MAX_STEPS;
    }
}
