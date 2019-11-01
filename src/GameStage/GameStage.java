package GameStage;

import GameField.GameField;

import javax.swing.*;
import java.awt.*;

public class GameStage extends JFrame {
    private static final int WIDTH_SCREEN = 1440;
    private static final int HEIGHT_SCREEN = 720;

    public static void main(String[] args) {
        new GameStage();
    }

    public GameStage() throws HeadlessException {
        new JFrame();
        this.setTitle("Tower Defense ");
        this.setSize(WIDTH_SCREEN, HEIGHT_SCREEN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        GameField gameField=new GameField(this);
        this.add(gameField);
    }
}
