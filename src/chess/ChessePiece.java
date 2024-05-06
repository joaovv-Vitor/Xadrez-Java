package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessePiece extends Piece {
    private Color color;

    public ChessePiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
