package naming;

import chessboard.Position;

public interface NamingStrategy {
    String toRepresentationalString(Position from);

    Position fromRepresentationalString(String from);
}
