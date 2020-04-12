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
                new CompositeDirection(new LeftDiagonalUp(), new HorizontalLeft()),
                new CompositeDirection(new LeftDiagonalUp(), new VerticalUp()),
                new CompositeDirection(new RightDiagonalUp(), new VerticalUp()),
                new CompositeDirection(new RightDiagonalUp(), new HorizontalRight()),
                new CompositeDirection(new RightDiagonalDown(), new HorizontalRight()),
                new CompositeDirection(new RightDiagonalDown(), new VerticalDown()),
                new CompositeDirection(new LeftDiagonalDown(), new VerticalDown()),
                new CompositeDirection(new LeftDiagonalDown(), new HorizontalLeft())
            );
    }

    @Override
    int stepCount() {
        return MIN_STEPS;
    }
}
