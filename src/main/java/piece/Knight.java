package piece;

import naming.NamingStrategy;
import rule.*;

import java.util.Arrays;
import java.util.List;

import static chessboard.Chessboard.MIN_STEPS;

public class Knight extends Piece {
    public Knight(NamingStrategy namingStrategy) {
        super(namingStrategy);
    }

    @Override
    List<Direction> getDirections() {
        return
            Arrays.asList(
                new Composite(new LeftDiagonalUp(), new HorizontalLeft()),
                new Composite(new LeftDiagonalUp(), new VerticalUp()),
                new Composite(new RightDiagonalUp(), new VerticalUp()),
                new Composite(new RightDiagonalUp(), new HorizontalRight()),
                new Composite(new RightDiagonalDown(), new HorizontalRight()),
                new Composite(new RightDiagonalDown(), new VerticalDown()),
                new Composite(new LeftDiagonalDown(), new VerticalDown()),
                new Composite(new LeftDiagonalDown(), new HorizontalLeft())
            );
    }

    @Override
    int stepCount() {
        return MIN_STEPS;
    }
}
