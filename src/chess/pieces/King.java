package chess.pieces;

import boardgame.Board;
import chess.ChessePiece;
import chess.Color;

public class King extends ChessePiece {

    public King(Board board, Color color) {
        super(board, color);
    }   
    @Override
    public String toString() {
        return "K";
    }

}
