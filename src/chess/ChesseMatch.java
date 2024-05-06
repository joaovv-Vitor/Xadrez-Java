package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rock;

public class ChesseMatch {
    private Board board;
    
    public ChesseMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    public ChessePiece[][] gChessePieces(){
        ChessePiece[][] mat = new ChessePiece[board.getRows()][board.getColumns()];

        for(int i = 0; i<board.getRows();i++){
            for(int j = 0; j<board.getColumns();j++){
                mat[i][j] = (ChessePiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rock(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
    }




}
