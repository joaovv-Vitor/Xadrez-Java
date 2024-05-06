import chess.ChesseMatch;

public class App {
    public static void main(String[] args) throws Exception {

        ChesseMatch chesseMatch = new ChesseMatch();

        UI.printBoard(chesseMatch.gChessePieces());
    }
}
