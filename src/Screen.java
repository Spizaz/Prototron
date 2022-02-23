import java.awt.*;

public class Screen {
    private final Draw SCREEN;
    private final int WIDTH;
    private final int HEIGHT;
    private final double SQUARE_SIZE;
    private static final Color LIGHT_COLOR = new Color(0xf1d9c0);
    private static final Color DARK_COLOR = new Color(0x9D705B);

    public Screen(int screenSize) {
        this.WIDTH = screenSize;
        this.HEIGHT = screenSize;
        this.SQUARE_SIZE = WIDTH / 8.;
        this.SCREEN = new Draw();
        SCREEN.setCanvasSize(WIDTH, HEIGHT);
        SCREEN.enableDoubleBuffering();
    }

    public void drawBoard(ChessBoard board){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i+j) % 2 == 0)
                    SCREEN.setPenColor(LIGHT_COLOR);
                else
                    SCREEN.setPenColor(DARK_COLOR);

                SCREEN.filledSquare(i/8. + SQUARE_SIZE/2., j/8. + SQUARE_SIZE/2., SQUARE_SIZE/2.);
            }
        }
        SCREEN.show();
    }
}
