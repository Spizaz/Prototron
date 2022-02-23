public class ChessBoard {
    private byte[][] board;

        private final static byte WHITE_COLOR = 64;
    private final static byte BLACK_COLOR = -128;

    private final static byte PAWN = 1;
    private final static byte KNIGHT = 2;
    private final static byte BISHOP = 4;
    private final static byte ROOK = 8;
    private final static byte QUEEN = 16;
    private final static byte KING = 32;

    public ChessBoard() {

    }

    public String getFEN(){
        return "";
    }

    public void setFEN(){

    }

    private void setPiece(int rank, int file, byte piece){
        board[rank][file] = piece;
    }

    private boolean isWhite(byte piece){
        return (piece & WHITE_COLOR) != 0;
    }

    private boolean isBlack(byte piece){
        return (piece & BLACK_COLOR) != 0;
    }
}
