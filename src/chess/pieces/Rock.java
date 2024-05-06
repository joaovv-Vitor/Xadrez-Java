package chess.pieces;

import boardgame.Board;
import chess.ChessePiece;
import chess.Color;

public class Rock extends ChessePiece {

    public Rock(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
