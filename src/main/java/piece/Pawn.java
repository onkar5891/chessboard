package piece;

import chessboard.Position;
import naming.NamingStrategy;
import rule.Composite;
import rule.Direction;
import rule.VerticalUp;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static chessboard.Chessboard.MIN_STEPS;
import static chessboard.Chessboard.PAWN_HOME_RANK;

public class Pawn extends Piece {
    public Pawn(NamingStrategy namingStrategy) {
        super(namingStrategy);
    }

    @Override
    List<Direction> getDirections() {
        return Collections.singletonList(new VerticalUp());
    }

    @Override
    protected List<String> availableMoves(String from) {
        List<String> positions = super.availableMoves(from);

        Optional<Position> positionOpt = applyTwiceUp(from);
        positionOpt.map(namingStrategy::toRepresentationalString).ifPresent(positions::add);

        return positions;
    }

    private Optional<Position> applyTwiceUp(String from) {
        Position current = namingStrategy.fromRepresentationalString(from);
        Direction twiceUp = new Composite(new VerticalUp(), new VerticalUp());

        if (PAWN_HOME_RANK.test(current)) {
            return Optional.of(current.add(twiceUp.next()));
        }
        return Optional.empty();
    }

    @Override
    int stepCount() {
        return MIN_STEPS;
    }
}
