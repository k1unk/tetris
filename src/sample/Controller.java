package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Random;

import static sample.Figure.*;
import static sample.Repaint.repaintForMove;
import static sample.Repaint.repaintForSwap;
import static sample.Repaint.repaintNext;

public class Controller {

    private void tostring() {
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 10; i++) s.append(arr[i][j]);
            s.append("\n");
        }
        System.out.println(s);
    }

    static Figure figure;
    static Figure figureNext;
    private int COUNT = 0;
    boolean GG = false;
    private boolean inCheckLine = false;
    private boolean inDeleteLine = false;
    private boolean inGame = false;
    static int x11, x22, x33, x44, y11, y22, y33, y44;
    static int xc1, xc2, xc3, xc4, yc1, yc2, yc3, yc4;
    private final double SPEED = 0.5;
    private Figure[] figures = {LINE_VERTIC, LINE_HORIZ,
            KVADRAT,
            T_UP, T_DOWN, T_LEFT, T_RIGHT,
            L_UP, L_DOWN, L_LEFT, L_RIGHT,
            J_UP, J_DOWN, J_LEFT, J_RIGHT,
            Z_VERTIC, Z_HORIZ, S_VERTIC, S_HORIZ};
    private Random random = new Random();
    private Random random2 = new Random();
    static int[][] arr = new int[10][24];
    static int x1, x2, x3, x4, y1, y2, y3, y4;

    @FXML
    private Pane mainPane;
    @FXML
    private Pane miniPane;
    @FXML
    private ImageView imageNEXT;
    @FXML
    private ImageView imageSTART;
    @FXML
    private Button startButton;
    @FXML
    private ImageView image1;
    @FXML
    private ImageView image10;
    @FXML
    private ImageView image100;
    @FXML
    private ImageView image1000;
    @FXML
    private ImageView image10000;

    @FXML
    private void initialize() {
        Image imageNext = new Image("sample/images/next.png");
        Image imageStart = new Image("sample/images/start.png");
        Image imagePusto = new Image("sample/images/pusto.png");
        imageNEXT.setImage(imageNext);
        imageSTART.setImage(imageStart);
        image1.setImage(imagePusto);
        image10.setImage(imagePusto);
        image100.setImage(imagePusto);
        image1000.setImage(imagePusto);
        image10000.setImage(imagePusto);

        imageSTART.setOnMouseClicked(Event -> {
            start();
            imageSTART.setVisible(false);
        });
        startButton.setOnKeyPressed(this::keyPressed);

        Timeline fs = new Timeline(new KeyFrame(Duration.seconds(SPEED), e -> {
            if (inGame && !inCheckLine && !inDeleteLine) moveDown();
        }));
        fs.setCycleCount(Timeline.INDEFINITE);
        fs.play();
    }

    private void endTheGame() {
        inGame = false;
        clearMiniPane();
        Image imageWhite3 = new Image("sample/images/imageLOST.png");
        ImageView imW5 = new ImageView(imageWhite3);
        imW5.setImage(imageWhite3);
        imW5.setX(0);
        imW5.setY(0);
        mainPane.getChildren().add(imW5);
        imageSTART.setVisible(true);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 24; j++) {
                arr[i][j] = 0;
            }
        }
        GG = false;
    }

    private void moveDown() {
        boolean possibility = true;
        if (y1 == 23 || arr[x1][y1 + 1] == 8) possibility = false;
        if (y2 == 23 || arr[x2][y2 + 1] == 8) possibility = false;
        if (y3 == 23 || arr[x3][y3 + 1] == 8) possibility = false;
        if (y4 == 23 || arr[x4][y4 + 1] == 8) possibility = false;
        if (possibility) {
            arr[x1][y1] = 0;
            arr[x2][y2] = 0;
            arr[x3][y3] = 0;
            arr[x4][y4] = 0;
            arr[x1][y1 + 1] = 1;
            arr[x2][y2 + 1] = 1;
            arr[x3][y3 + 1] = 1;
            arr[x4][y4 + 1] = 1;
            y1++;
            y2++;
            y3++;
            y4++;
            repaintForMoveController(0, 40, 4);
        }
        if (!possibility) {
            arr[x1][y1] = 8;
            arr[x2][y2] = 8;
            arr[x3][y3] = 8;
            arr[x4][y4] = 8;
            checkLine();
            checkGG();
            if (!GG) addNewBlock();
            else endTheGame();
        }
    }


    private void checkGG() {
        for (int i = 0; i < 10; i++) {
            if (arr[i][3] == 8) GG = true;
        }
    }

    private void checkLine() {
        inCheckLine = true;
        int countx = 0;
        for (int j = 4; j < 24; j++) {
            for (int i = 0; i < 10; i++) {
                if (arr[i][j] == 8) countx++;
            }
            if (countx == 10) {
                inDeleteLine = true;
                deleteLine(j);
                break;
            }
            countx = 0;
        }
        inCheckLine = false;
    }

    private void changeCount() {
        if (COUNT == 0) {
            image1.setImage(new Image("sample/images/pusto.png"));
            image10.setImage(new Image("sample/images/pusto.png"));
            image100.setImage(new Image("sample/images/pusto.png"));
            image1000.setImage(new Image("sample/images/pusto.png"));
            image10000.setImage(new Image("sample/images/pusto.png"));
        }
        if (COUNT > 0 && COUNT < 10) {
            image1.setImage(new Image("sample/images/" + COUNT / 1 % 10 + ".png"));
        }
        if (COUNT > 9 && COUNT < 100) {
            image1.setImage(new Image("sample/images/" + COUNT / 1 % 10 + ".png"));
            image10.setImage(new Image("sample/images/" + COUNT / 10 % 10 + ".png"));
        }
        if (COUNT > 99 && COUNT < 1000) {
            image1.setImage(new Image("sample/images/" + COUNT / 1 % 10 + ".png"));
            image10.setImage(new Image("sample/images/" + COUNT / 10 % 10 + ".png"));
            image100.setImage(new Image("sample/images/" + COUNT / 100 % 10 + ".png"));
        }
        if (COUNT > 999 && COUNT < 10000) {
            image1.setImage(new Image("sample/images/" + COUNT / 1 % 10 + ".png"));
            image10.setImage(new Image("sample/images/" + COUNT / 10 % 10 + ".png"));
            image100.setImage(new Image("sample/images/" + COUNT / 100 % 10 + ".png"));
            image1000.setImage(new Image("sample/images/" + COUNT / 1000 % 10 + ".png"));
        }
        if (COUNT > 9999 && COUNT < 100000) {
            image1.setImage(new Image("sample/images/" + COUNT / 1 % 10 + ".png"));
            image10.setImage(new Image("sample/images/" + COUNT / 10 % 10 + ".png"));
            image100.setImage(new Image("sample/images/" + COUNT / 100 % 10 + ".png"));
            image1000.setImage(new Image("sample/images/" + COUNT / 1000 % 10 + ".png"));
            image10000.setImage(new Image("sample/images/" + COUNT / 10000 % 10 + ".png"));
        }
    }

    private void deleteLine(int j) {
        COUNT = COUNT + 20;
        changeCount();
        final int[] xCoord = {9};
        Timeline fs = new Timeline(new KeyFrame(Duration.seconds(0.07), e -> {
            Image imageWhite3 = new Image("sample/images/white.jpg");
            ImageView imW5 = new ImageView(imageWhite3);
            imW5.setImage(imageWhite3);
            imW5.setX(xCoord[0] * 40);
            imW5.setY(j * 40 - 160);
            if (xCoord[0] != -1) mainPane.getChildren().add(imW5);
            xCoord[0]--;
            if (xCoord[0] == -2) {
                repaintDelete(j);
                checkLine();
            }
        }));
        fs.setCycleCount(11);
        fs.play();
    }

    private void repaintDelete(int j) {
        for (int ty = j; ty > 4; ty--) {
            for (int i = 0; i < 10; i++) {
                arr[i][ty] = arr[i][ty - 1];
                if (arr[i][ty] == 0) {
                    Image imageWhite1 = new Image("sample/images/white.jpg");
                    ImageView imW1 = new ImageView(imageWhite1);
                    imW1.setImage(imageWhite1);
                    imW1.setX(i * 40);
                    imW1.setY(ty * 40 - 160);
                    mainPane.getChildren().add(imW1);
                }
                if (arr[i][ty] == 8) {
                    Image imageBlack4 = new Image("sample/images/black.jpg");
                    ImageView imB4 = new ImageView(imageBlack4);
                    imB4.setImage(imageBlack4);
                    imB4.setX(i * 40);
                    imB4.setY(ty * 40 - 160);
                    mainPane.getChildren().add(imB4);
                }
            }
        }
        inDeleteLine = false;
    }

    private void moveRL(int predelX, int plusOrMinusX) {
        boolean possibilityToMove = true;
        if (x1 == predelX || arr[x1 + plusOrMinusX][y1] == 8) possibilityToMove = false;
        if (x2 == predelX || arr[x2 + plusOrMinusX][y2] == 8) possibilityToMove = false;
        if (x3 == predelX || arr[x3 + plusOrMinusX][y3] == 8) possibilityToMove = false;
        if (x4 == predelX || arr[x4 + plusOrMinusX][y4] == 8) possibilityToMove = false;
        if (possibilityToMove) {
            arr[x1][y1] = 0;
            arr[x2][y2] = 0;
            arr[x3][y3] = 0;
            arr[x4][y4] = 0;
            arr[x1 + plusOrMinusX][y1] = 1;
            arr[x2 + plusOrMinusX][y2] = 1;
            arr[x3 + plusOrMinusX][y3] = 1;
            arr[x4 + plusOrMinusX][y4] = 1;
            x1 = x1 + plusOrMinusX;
            x2 = x2 + plusOrMinusX;
            x3 = x3 + plusOrMinusX;
            x4 = x4 + plusOrMinusX;
            repaintForMoveController(plusOrMinusX, 0, 3);
        }
    }

    private void keyPressed(KeyEvent ke) {
        if (ke.getCode().getName().equals("D") || ke.getCode().equals(KeyCode.RIGHT)) {
            moveRL(9, 1);
        }
        if (ke.getCode().getName().equals("S") || ke.getCode().equals(KeyCode.DOWN)) {
            if (inGame && !inCheckLine && !inDeleteLine) moveDown();
        }
        if (ke.getCode().getName().equals("A") || ke.getCode().equals(KeyCode.LEFT)) {
            moveRL(0, -1);
        }
        if (ke.getCode().equals(KeyCode.SPACE)) {
            swap();
            if (y1 > 3) repaintForSwapController();
        }
    }


    private void repaintForSwapController() {
        if (y1 > 3 && y2 > 3 && y3 > 3 && y4 > 3) {
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "1"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "2"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "3"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "4"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "5"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "6"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "7"));
            mainPane.getChildren().add(repaintForSwap(x11, x22, x33, x44, y11, y22, y33, y44, "8"));
        }
    }

    private void repaintForMoveController(int xMove, int ifDown, int yIs3or4) {
        if (y4 > yIs3or4) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "w4"));
        if (y3 > yIs3or4) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "w3"));
        if (y2 > yIs3or4) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "w2"));
        if (y1 > yIs3or4) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "w1"));
        if (y4 > 3) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "b4"));
        if (y3 > 3) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "b3"));
        if (y2 > 3) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "b2"));
        if (y1 > 3) mainPane.getChildren().add(repaintForMove(xMove, ifDown, "b1"));
    }

    private void start() {
        COUNT = 0;
        changeCount();
        startMainPane();
        clearMiniPane();
        inGame = true;
        addNewBlock();
    }

    private void clearMiniPane() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Image image = new Image("sample/images/white.jpg");
                ImageView im = new ImageView(image);
                im.setImage(image);
                im.setFitHeight(40);
                im.setFitWidth(40);
                im.setX(i * 40);
                im.setY(j * 40);
                miniPane.getChildren().add(im);
            }
        }
    }

    private void startMainPane() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                Image image = new Image("sample/images/white.jpg");
                ImageView im = new ImageView(image);
                im.setImage(image);
                im.setFitHeight(40);
                im.setFitWidth(40);
                im.setX(i * 40);
                im.setY(j * 40);
                mainPane.getChildren().add(im);
            }
        }
    }

    private void addNewBlock() {
        if (COUNT == 0) figure = figures[random.nextInt(18)];
        else figure = figureNext;
        Figure.makeBlock(figure);
        arr[x1][y1] = 1;
        arr[x2][y2] = 1;
        arr[x3][y3] = 1;
        arr[x4][y4] = 1;
        COUNT = COUNT + 5;
        changeCount();
        figureNext = figures[random2.nextInt(18)];
        Figure.makeNextBlock();
        showNext();
    }

    private void showNext() {
        clearMiniPane();
        miniPane.getChildren().add(repaintNext("1"));
        miniPane.getChildren().add(repaintNext("2"));
        miniPane.getChildren().add(repaintNext("3"));
        miniPane.getChildren().add(repaintNext("4"));
    }
}
