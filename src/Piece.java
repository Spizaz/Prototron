public class Piece {
    static byte whiteColor = 64;
    static byte blackColor = -128;

    static byte pawn = 1;
    static byte knight = 2;
    static byte bishop = 4;
    static byte rook = 8;
    static byte queen = 16;
    static byte king = 32;

    public byte value;


    Piece(boolean isWhite, char pieceType){
        value = 0;

        if(isWhite){
            value |= whiteColor;
        }
        else{
            value |= blackColor;
        }

        pieceType = (pieceType+"").toUpperCase().charAt(0);

        switch (pieceType) {
            case 'P' -> pieceType |= Piece.pawn;
            case 'N' -> pieceType |= Piece.knight;
            case 'B' -> pieceType |= Piece.bishop;
            case 'R' -> pieceType |= Piece.rook;
            case 'Q' -> pieceType |= Piece.queen;
            case 'K' -> pieceType |= Piece.king;
        }
    }
}
