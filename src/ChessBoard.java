import java.awt.*;

public class ChessBoard {
    private final int BOARD_SIZE;
    private final int SQUARE_SIZE;
    private final Color lightColor = new Color(0xf1d9c0);
    private final Color darkColor = new Color(0x9D705B);
    private byte[][] board;
    private final Draw scene;

    public ChessBoard(int BOARD_SIZE) {
        this.BOARD_SIZE = BOARD_SIZE;
        this.SQUARE_SIZE = BOARD_SIZE / 8;
        this.scene = new Draw();
        scene.setCanvasSize(BOARD_SIZE, BOARD_SIZE);
        scene.enableDoubleBuffering();
        drawBoard();
    }

    public void drawBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j) % 2 == 0)
                    scene.setPenColor(lightColor);
                else
                    scene.setPenColor(darkColor);

                scene.filledSquare(i/8. + SQUARE_SIZE/2., j/8. + SQUARE_SIZE/2., SQUARE_SIZE/2.);
            }
        }
        scene.show();
    }
}
