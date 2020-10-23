package choboTetris;

import javax.swing.*;
import java.awt.*;

// JFrame: 프레임 역할을 하는 클래스. 일종의 화면 창.
// JFrame으로부터 상속받은 TetrisMain 클래스
public class TetrisMain extends JFrame {
    JLabel statusbar;                               // 스테이터스 바(상태창) 라벨 참조변수 생성

    public TetrisMain() {
        statusbar = new JLabel("");            // 빈 텍스트로 객체 생성
        // 상태창 폰트 이름을 가져와서 설정, 일반 폰트 형태로 출력, 18포인트 크기
        statusbar.setFont(new Font(statusbar.getFont().getFontName(), Font.PLAIN, 18));
        add(statusbar, BorderLayout.SOUTH);         // 윈도우 창에 추가함(상태창을, 보더 레이아웃의 SOUTH 부분에)

        // 테트리스 보드 GUI 객체를 생성()
        TetrisBoardGui tetrisBoardGui  = new TetrisBoardGui(this);
        add(tetrisBoardGui);                        // 윈도우 창에 추가함(설정한 테트리스 보드 GUI를)

        tetrisBoardGui.start();                     // playerOne 초기화 + 상태창 텍스트 설정

        setSize(390, 630);              // 윈도우 사이즈 설정
        setTitle("Einspänner Team - Tetris");                    // 윈도우 타이틀 텍스트 설정


        setDefaultCloseOperation(EXIT_ON_CLOSE);    // 윈도우 창 종료 시, 프로세스 종료 - 메모리 누수 방지
    }

    public JLabel getStatusBar() {
        return statusbar;                           // 상태창의 설정을 그대로 반환
    }

    public static void main(String[] args) {
        TetrisMain tetrisGui = new TetrisMain();    // 테트리스 GUI 객체를 생성
        tetrisGui.setLocationRelativeTo(null);      // 테트리스 GUI를 화면 가운데에 출력하도록 위치 설정(null)
        tetrisGui.setVisible(true);                 // 테트리스 GUI를 화면 상에 보이도록 출력 설정(true)
    }
}