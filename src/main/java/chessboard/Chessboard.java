package chessboard;

import java.util.function.Predicate;

public class Chessboard {
    public static final int MIN_STEPS = 1;
    public static final int MAX_STEPS = 7;

    public static final Predicate<Position> INVALID_POSITION =
        position -> (position.getI() < 0 || position.getI() > 7) || (position.getJ() < 0 || position.getJ() > 7);

    public static final Predicate<Position> PAWN_HOME_RANK = position -> position.getI() == 6;
}
