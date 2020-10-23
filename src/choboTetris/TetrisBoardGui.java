package choboTetris;

import com.chobocho.player.*;
import com.chobocho.tetris.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TetrisBoardGui extends JPanel implements ITetrisObserver {

    // 출력할 창의 너비와 높이 상수
    final int BOARD_WIDTH = 13;
    final int BOARD_HEIGHT = 20;

    IPlayer playerOne;
    IPlayerDraw playerOneDraw;
    IPlayerAction playerOneAction;

    // 출력할 라벨(상태창)
    JLabel statusbar;

    private Image screenBuffer = null;
    private Graphics graphicsBuffer = null;

    // 테트리스 보드 GUI의 생성자(TetrisMain을 부모 클래스로 상속받음)
    public TetrisBoardGui(TetrisMain parent) {
        playerOneDraw = new PlayerOneDraw();            // 플레이어1 드로우 객체 생성
        playerOneAction = new PlayerOneAction();        // 플레이어1 액션 객체 생성
        // 플레이어
        playerOne = new Player(this, playerOneDraw, playerOneAction);

        statusbar = parent.getStatusBar();              // 설정한 상태창을 그대로 적용
        setFocusable(true);                             // 컴퍼넌트의 포커스 상태가 지정된 값으로 설정
        addKeyListener(new TetrisKeyAdapter());
    }

    public void update() {
        System.out.println("Tetris (d) View.update()");
        repaint();
    }

    private int blockWidth()  { return (int) getSize().getWidth()  / BOARD_WIDTH;  }
    private int blockHeight() { return (int) getSize().getHeight() / BOARD_HEIGHT; }


    public void start()
    {
        playerOne.init();

        // 상태창에서 출력할 텍스트 설정
        statusbar.setText("Press S to start game!");
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Dimension size = getSize();

        int width = (int)size.getWidth();
        int height = (int)size.getHeight();

        if (screenBuffer == null) {
            screenBuffer = createImage(width, height);
        }

        graphicsBuffer = screenBuffer.getGraphics();
        graphicsBuffer.setColor(Color.DARK_GRAY);
        graphicsBuffer.fillRect(0, 0, width, height);

        int boardY = (int) size.getHeight() - BOARD_HEIGHT * blockHeight();
        int boardX = (int) (size.getWidth() - BOARD_WIDTH * blockWidth())/2;

        playerOne.onDraw(graphicsBuffer, boardX, boardY, blockWidth(), blockHeight());

        g.drawImage(screenBuffer, 0, 0, null);

        screenBuffer = null;
    }

    class TetrisKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            playerOne.onPressKey(keycode);
        }
    }
}