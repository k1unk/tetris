package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import static sample.Controller.*;

class Repaint {
    static ImageView repaintNext(String str) {
        Image imageWhite4 = new Image("sample/images/black.jpg");
        ImageView imW4 = new ImageView(imageWhite4);
        imW4.setImage(imageWhite4);
        imW4.setX(xc4 * 40 - 120);
        imW4.setY(yc4 * 40);
        if (str == "4") return imW4;
        Image imageWhite3 = new Image("sample/images/black.jpg");
        ImageView imW3 = new ImageView(imageWhite3);
        imW3.setImage(imageWhite4);
        imW3.setX(xc3 * 40 - 120);
        imW3.setY(yc3 * 40);
        if (str == "3") return imW3;
        Image imageWhite2 = new Image("sample/images/black.jpg");
        ImageView imW2 = new ImageView(imageWhite2);
        imW2.setImage(imageWhite2);
        imW2.setX(xc2 * 40 - 120);
        imW2.setY(yc2 * 40);
        if (str == "2") return imW2;
        Image imageWhite1 = new Image("sample/images/black.jpg");
        ImageView imW1 = new ImageView(imageWhite1);
        imW1.setImage(imageWhite1);
        imW1.setX(xc1 * 40 - 120);
        imW1.setY(yc1 * 40);
        if (str == "1") return imW1;
        return imW1;
    }

    static ImageView repaintForSwap(int x11, int x22, int x33, int x44, int y11, int y22, int y33, int y44, String str) {
        if (y1 > 3 && y2 > 3 && y3 > 3 && y4 > 3) {
            Image imageWhite4 = new Image("sample/images/white.jpg");
            ImageView imW4 = new ImageView(imageWhite4);
            imW4.setImage(imageWhite4);
            imW4.setX((x4 - x44) * 40);
            imW4.setY((y4 - y44) * 40 - 160);
            if (str == "1") return imW4;
            Image imageWhite3 = new Image("sample/images/white.jpg");
            ImageView imW3 = new ImageView(imageWhite3);
            imW3.setImage(imageWhite3);
            imW3.setX((x3 - x33) * 40);
            imW3.setY((y3 - y33) * 40 - 160);
            if (str == "2") return imW3;
            Image imageWhite2 = new Image("sample/images/white.jpg");
            ImageView imW2 = new ImageView(imageWhite2);
            imW2.setImage(imageWhite2);
            imW2.setX((x2 - x22) * 40);
            imW2.setY((y2 - y22) * 40 - 160);
            if (str == "3") return imW2;
            Image imageWhite1 = new Image("sample/images/white.jpg");
            ImageView imW1 = new ImageView(imageWhite1);
            imW1.setImage(imageWhite1);
            imW1.setX((x1 - x11) * 40);
            imW1.setY((y1 - y11) * 40 - 160);
            if (str == "4") return imW1;

            Image imageBlack4 = new Image("sample/images/black.jpg");
            ImageView imB4 = new ImageView(imageBlack4);
            imB4.setImage(imageBlack4);
            imB4.setX(x4 * 40);
            imB4.setY(y4 * 40 - 160);
            if (str == "5") return imB4;
            Image imageBlack3 = new Image("sample/images/black.jpg");
            ImageView imB3 = new ImageView(imageBlack3);
            imB3.setImage(imageBlack3);
            imB3.setX(x3 * 40);
            imB3.setY(y3 * 40 - 160);
            if (str == "6") return imB3;
            Image imageBlack2 = new Image("sample/images/black.jpg");
            ImageView imB2 = new ImageView(imageBlack2);
            imB2.setImage(imageBlack2);
            imB2.setX(x2 * 40);
            imB2.setY(y2 * 40 - 160);
            if (str == "7") return imB2;
            Image imageBlack1 = new Image("sample/images/black.jpg");
            ImageView imB1 = new ImageView(imageBlack1);
            imB1.setImage(imageBlack1);
            imB1.setX(x1 * 40);
            imB1.setY(y1 * 40 - 160);
            if (str == "8") return imB1;
        }
        return new ImageView(new Image("sample/images/start.png"));
    }

    static ImageView repaintForMove(int xMove, int ifDown, String str) {
        Image imageWhite4 = new Image("sample/images/white.jpg");
        ImageView imW4 = new ImageView(imageWhite4);
        imW4.setImage(imageWhite4);
        imW4.setX(x4 * 40 - 40 * xMove);
        imW4.setY(y4 * 40 - 160 - ifDown);
        if (str == "w4") return imW4;
        Image imageWhite3 = new Image("sample/images/white.jpg");
        ImageView imW3 = new ImageView(imageWhite3);
        imW3.setImage(imageWhite3);
        imW3.setX(x3 * 40 - 40 * xMove);
        imW3.setY(y3 * 40 - 160 - ifDown);
        if (str == "w3") return imW3;
        Image imageWhite2 = new Image("sample/images/white.jpg");
        ImageView imW2 = new ImageView(imageWhite2);
        imW2.setImage(imageWhite2);
        imW2.setX(x2 * 40 - 40 * xMove);
        imW2.setY(y2 * 40 - 160 - ifDown);
        if (str == "w2") return imW2;
        Image imageWhite1 = new Image("sample/images/white.jpg");
        ImageView imW1 = new ImageView(imageWhite1);
        imW1.setImage(imageWhite1);
        imW1.setX(x1 * 40 - 40 * xMove);
        imW1.setY(y1 * 40 - 160 - ifDown);
        if (str == "w1") return imW1;

        Image imageBlack4 = new Image("sample/images/black.jpg");
        ImageView imB4 = new ImageView(imageBlack4);
        imB4.setImage(imageBlack4);
        imB4.setX(x4 * 40);
        imB4.setY(y4 * 40 - 160);
        if (str == "b4") return imB4;
        Image imageBlack3 = new Image("sample/images/black.jpg");
        ImageView imB3 = new ImageView(imageBlack3);
        imB3.setImage(imageBlack3);
        imB3.setX(x3 * 40);
        imB3.setY(y3 * 40 - 160);
        if (str == "b3") return imB3;
        Image imageBlack2 = new Image("sample/images/black.jpg");
        ImageView imB2 = new ImageView(imageBlack2);
        imB2.setImage(imageBlack2);
        imB2.setX(x2 * 40);
        imB2.setY(y2 * 40 - 160);
        if (str == "b2") return imB2;
        Image imageBlack1 = new Image("sample/images/black.jpg");
        ImageView imB1 = new ImageView(imageBlack1);
        imB1.setImage(imageBlack1);
        imB1.setX(x1 * 40);
        imB1.setY(y1 * 40 - 160);
        return imB1;
    }
}
