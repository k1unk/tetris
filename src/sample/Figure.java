package sample;

import static sample.Controller.*;

enum Figure {
    LINE_VERTIC, LINE_HORIZ,
    KVADRAT,
    T_UP, T_DOWN, T_LEFT, T_RIGHT,
    L_UP, L_DOWN, L_LEFT, L_RIGHT,
    J_UP, J_DOWN, J_LEFT, J_RIGHT,
    S_VERTIC, S_HORIZ,
    Z_VERTIC, Z_HORIZ;

    static void makeNextBlock() {
        switch (figureNext) {
            case LINE_VERTIC: {
                xc1 = 4;
                xc2 = 4;
                xc3 = 4;
                xc4 = 4;
                yc1 = 0;
                yc2 = 1;
                yc3 = 2;
                yc4 = 3;
            }
            break;
            case LINE_HORIZ: {
                xc1 = 3;
                xc2 = 4;
                xc3 = 5;
                xc4 = 6;
                yc1 = 3;
                yc2 = 3;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case S_HORIZ: {
                xc1 = 5;
                xc2 = 4;
                xc3 = 4;
                xc4 = 3;
                yc1 = 2;
                yc2 = 2;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case S_VERTIC: {
                xc1 = 4;
                xc2 = 4;
                xc3 = 5;
                xc4 = 5;
                yc1 = 1;
                yc2 = 2;
                yc3 = 2;
                yc4 = 3;
            }
            break;
            case Z_VERTIC: {
                xc1 = 5;
                xc2 = 5;
                xc3 = 4;
                xc4 = 4;
                yc1 = 1;
                yc2 = 2;
                yc3 = 2;
                yc4 = 3;
            }
            break;
            case Z_HORIZ: {
                xc1 = 3;
                xc2 = 4;
                xc3 = 4;
                xc4 = 5;
                yc1 = 2;
                yc2 = 2;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case KVADRAT: {
                xc1 = 4;
                xc2 = 5;
                xc3 = 4;
                xc4 = 5;
                yc1 = 2;
                yc2 = 2;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case T_DOWN: {
                xc1 = 3;
                xc2 = 4;
                xc3 = 5;
                xc4 = 4;
                yc1 = 2;
                yc2 = 2;
                yc3 = 2;
                yc4 = 3;
            }
            break;
            case T_LEFT: {
                xc1 = 5;
                xc2 = 5;
                xc3 = 5;
                xc4 = 4;
                yc1 = 1;
                yc2 = 2;
                yc3 = 3;
                yc4 = 2;
            }
            break;
            case T_UP: {
                xc1 = 5;
                xc2 = 4;
                xc3 = 3;
                xc4 = 4;
                yc1 = 3;
                yc2 = 3;
                yc3 = 3;
                yc4 = 2;
            }
            break;
            case T_RIGHT: {
                xc1 = 4;
                xc2 = 4;
                xc3 = 4;
                xc4 = 5;
                yc1 = 3;
                yc2 = 2;
                yc3 = 1;
                yc4 = 2;
            }
            break;
            case L_DOWN: {
                xc1 = 4;
                xc2 = 4;
                xc3 = 4;
                xc4 = 5;
                yc1 = 1;
                yc2 = 2;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case L_LEFT: {
                xc1 = 5;
                xc2 = 4;
                xc3 = 3;
                xc4 = 3;
                yc1 = 2;
                yc2 = 2;
                yc3 = 2;
                yc4 = 3;
            }
            break;
            case L_UP: {
                xc1 = 5;
                xc2 = 5;
                xc3 = 5;
                xc4 = 4;
                yc1 = 3;
                yc2 = 2;
                yc3 = 1;
                yc4 = 1;
            }
            break;
            case L_RIGHT: {
                xc1 = 3;
                xc2 = 4;
                xc3 = 5;
                xc4 = 5;
                yc1 = 3;
                yc2 = 3;
                yc3 = 3;
                yc4 = 2;
            }
            break;
            case J_DOWN: {
                xc1 = 5;
                xc2 = 5;
                xc3 = 5;
                xc4 = 4;
                yc1 = 1;
                yc2 = 2;
                yc3 = 3;
                yc4 = 3;
            }
            break;
            case J_LEFT: {
                xc1 = 5;
                xc2 = 4;
                xc3 = 3;
                xc4 = 3;
                yc1 = 3;
                yc2 = 3;
                yc3 = 3;
                yc4 = 2;
            }
            break;
            case J_UP: {
                xc1 = 4;
                xc2 = 4;
                xc3 = 4;
                xc4 = 5;
                yc1 = 3;
                yc2 = 2;
                yc3 = 1;
                yc4 = 1;
            }
            break;
            case J_RIGHT: {
                xc1 = 3;
                xc2 = 4;
                xc3 = 5;
                xc4 = 5;
                yc1 = 2;
                yc2 = 2;
                yc3 = 2;
                yc4 = 3;
            }
            break;
        }
    }

    static void makeBlock(Figure f) {
        switch (f) {
            case LINE_VERTIC: {
                x1 = 4;
                x2 = 4;
                x3 = 4;
                x4 = 4;
                y1 = 0;
                y2 = 1;
                y3 = 2;
                y4 = 3;
            }
            break;
            case LINE_HORIZ: {
                x1 = 3;
                x2 = 4;
                x3 = 5;
                x4 = 6;
                y1 = 3;
                y2 = 3;
                y3 = 3;
                y4 = 3;
            }
            break;
            case S_HORIZ: {
                x1 = 5;
                x2 = 4;
                x3 = 4;
                x4 = 3;
                y1 = 2;
                y2 = 2;
                y3 = 3;
                y4 = 3;
            }
            break;
            case S_VERTIC: {
                x1 = 4;
                x2 = 4;
                x3 = 5;
                x4 = 5;
                y1 = 1;
                y2 = 2;
                y3 = 2;
                y4 = 3;
            }
            break;
            case Z_VERTIC: {
                x1 = 5;
                x2 = 5;
                x3 = 4;
                x4 = 4;
                y1 = 1;
                y2 = 2;
                y3 = 2;
                y4 = 3;
            }
            break;
            case Z_HORIZ: {
                x1 = 3;
                x2 = 4;
                x3 = 4;
                x4 = 5;
                y1 = 2;
                y2 = 2;
                y3 = 3;
                y4 = 3;
            }
            break;
            case KVADRAT: {
                x1 = 4;
                x2 = 5;
                x3 = 4;
                x4 = 5;
                y1 = 2;
                y2 = 2;
                y3 = 3;
                y4 = 3;
            }
            break;
            case T_DOWN: {
                x1 = 3;
                x2 = 4;
                x3 = 5;
                x4 = 4;
                y1 = 2;
                y2 = 2;
                y3 = 2;
                y4 = 3;
            }
            break;
            case T_LEFT: {
                x1 = 5;
                x2 = 5;
                x3 = 5;
                x4 = 4;
                y1 = 1;
                y2 = 2;
                y3 = 3;
                y4 = 2;
            }
            break;
            case T_UP: {
                x1 = 5;
                x2 = 4;
                x3 = 3;
                x4 = 4;
                y1 = 3;
                y2 = 3;
                y3 = 3;
                y4 = 2;
            }
            break;
            case T_RIGHT: {
                x1 = 4;
                x2 = 4;
                x3 = 4;
                x4 = 5;
                y1 = 3;
                y2 = 2;
                y3 = 1;
                y4 = 2;
            }
            break;
            case L_DOWN: {
                x1 = 4;
                x2 = 4;
                x3 = 4;
                x4 = 5;
                y1 = 1;
                y2 = 2;
                y3 = 3;
                y4 = 3;
            }
            break;
            case L_LEFT: {
                x1 = 5;
                x2 = 4;
                x3 = 3;
                x4 = 3;
                y1 = 2;
                y2 = 2;
                y3 = 2;
                y4 = 3;
            }
            break;
            case L_UP: {
                x1 = 5;
                x2 = 5;
                x3 = 5;
                x4 = 4;
                y1 = 3;
                y2 = 2;
                y3 = 1;
                y4 = 1;
            }
            break;
            case L_RIGHT: {
                x1 = 3;
                x2 = 4;
                x3 = 5;
                x4 = 5;
                y1 = 3;
                y2 = 3;
                y3 = 3;
                y4 = 2;
            }
            break;
            case J_DOWN: {
                x1 = 5;
                x2 = 5;
                x3 = 5;
                x4 = 4;
                y1 = 1;
                y2 = 2;
                y3 = 3;
                y4 = 3;
            }
            break;
            case J_LEFT: {
                x1 = 5;
                x2 = 4;
                x3 = 3;
                x4 = 3;
                y1 = 3;
                y2 = 3;
                y3 = 3;
                y4 = 2;
            }
            break;
            case J_UP: {
                x1 = 4;
                x2 = 4;
                x3 = 4;
                x4 = 5;
                y1 = 3;
                y2 = 2;
                y3 = 1;
                y4 = 1;
            }
            break;
            case J_RIGHT: {
                x1 = 3;
                x2 = 4;
                x3 = 5;
                x4 = 5;
                y1 = 2;
                y2 = 2;
                y3 = 2;
                y4 = 3;
            }
            break;
        }
    }

    static void swap() {
        switch (figure) {
            case LINE_HORIZ: {
                if (y1 > 5) {
                    if (y2 != 23 && arr[x2][y2 + 1] != 8 && arr[x2][y2 - 1] != 8 && arr[x2][y2 - 2] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -2;
                        y11 = -2;
                        y22 = -1;
                        y33 = 0;
                        y44 = 1;
                        figure = LINE_VERTIC;
                    } else if (arr[x2][y2] != 8 && arr[x2][y2 - 1] != 8 && arr[x2][y2 - 2] != 8 && arr[x2][y2 - 3] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -2;
                        y11 = -3;
                        y22 = -2;
                        y33 = -1;
                        y44 = 0;
                        figure = LINE_VERTIC;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case LINE_VERTIC: {
                if (y4 > 6) {
                    if (y1 > 3 && x1 != 0 && x1 != 9 && x1 != 8 && arr[x1 - 1][y1 + 2] == 0 && arr[x3 + 1][y3] == 0 && arr[x4 + 2][y4 - 1] == 0) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 2;
                        y11 = 2;
                        y22 = 1;
                        y33 = 0;
                        y44 = -1;
                        figure = LINE_HORIZ;
                    } else if (x1 != 1 && x1 != 0 && x1 != 9 && x1 != 8 && arr[x3 + 2][y3] == 8 && arr[x1 - 2][y1 + 2] == 0 &&
                            arr[x2 - 1][y2 + 1] == 0 && arr[x4 + 1][y4 - 1] == 0) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = 2;
                        y22 = 1;
                        y33 = 0;
                        y44 = -1;
                        figure = LINE_HORIZ;
                    } else if (x1 == 0 && arr[x2 + 1][y2 + 1] == 0 && arr[x3 + 2][y3] == 0 && arr[x4 + 3][y4 - 1] == 0) {
                        x11 = 0;
                        x22 = 1;
                        x33 = 2;
                        x44 = 3;
                        y11 = 2;
                        y22 = 1;
                        y33 = 0;
                        y44 = -1;
                        figure = LINE_HORIZ;
                    } else if (x1 == 8 && arr[x1 - 2][y1 + 2] == 0 && arr[x2 - 1][y2 + 1] == 0 && arr[x4 + 1][y4 - 1] == 0) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = 2;
                        y22 = 1;
                        y33 = 0;
                        y44 = -1;
                        figure = LINE_HORIZ;
                    } else if (x1 == 9 && arr[x1 - 3][y1 + 2] == 0 && arr[x2 - 2][y2 + 1] == 0 && arr[x3 - 1][y3] == 0) {
                        x11 = -3;
                        x22 = -2;
                        x33 = -1;
                        x44 = 0;
                        y11 = 2;
                        y22 = 1;
                        y33 = 0;
                        y44 = -1;
                        figure = LINE_HORIZ;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;


            case J_DOWN: {
                if (y1 > 3) {
                    if ((x1 < 9) && arr[x1 + 1][y2] != 8 && arr[x3 - 1][y2] != 8 && arr[x4][y1] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = 0;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -2;
                        figure = J_LEFT;
                    } else if (x4 != 0 && arr[x2 - 1][y2] != 8 && arr[x3 - 2][y2] != 8 && arr[x4 - 1][y1] != 8) {
                        x11 = 0;
                        x22 = -1;
                        x33 = -2;
                        x44 = -1;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -2;
                        figure = J_LEFT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case J_LEFT: {
                if (y4 > 3) {
                    if (y4 != 23 && arr[x1 - 1][y1 + 1] != 8 && arr[x3 + 1][y3 - 1] != 8 && arr[x4 + 2][y4] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 2;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 0;
                        figure = J_UP;
                    } else if (arr[x2][y2 - 1] != 8 && arr[x3 + 1][y3 - 2] != 8 && arr[x4 + 2][y4 - 1] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 2;
                        y11 = 0;
                        y22 = -1;
                        y33 = -2;
                        y44 = -1;
                        figure = J_UP;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }

            }
            break;
            case J_UP: {
                if (y4 > 3) {
                    if (x1 > 0 && arr[x1 - 1][y1 - 1] != 8 && arr[x3 + 1][y3 + 1] != 8 && arr[x4][y4 + 2] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 0;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 2;
                        figure = J_RIGHT;
                    } else if (x4 != 9 && arr[x2 + 1][y2] != 8 && arr[x3 + 2][y3 + 1] != 8 && arr[x4 + 1][y4 + 2] != 8) {
                        x11 = 0;
                        x22 = 1;
                        x33 = 2;
                        x44 = 1;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 2;
                        figure = J_RIGHT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case J_RIGHT: {
                if (y4 > 5) {
                    if (arr[x1 + 1][y1 - 1] != 8 && arr[x3 - 1][y3 + 1] != 8 && arr[x4 - 2][y4] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -2;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 0;
                        figure = J_DOWN;
                    } else if (arr[x1 + 2][y1 - 1] != 8 && arr[x4 - 1][y4] != 8) {
                        x11 = 2;
                        x22 = 1;
                        x33 = 0;
                        x44 = -1;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 0;
                        figure = J_DOWN;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;


            case L_DOWN: {
                if (y1 > 3) {
                    if (x1 != 0 && arr[x1 + 1][y1 + 1] != 8 && arr[x3 - 1][y3 - 1] != 8 && arr[x4 - 2][y4] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -2;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 0;
                        figure = L_LEFT;
                    } else if (x4 != 9 && arr[x1 + 2][y1 + 1] != 8 && arr[x2 + 1][y2] != 8) {
                        x11 = 2;
                        x22 = 1;
                        x33 = 0;
                        x44 = -1;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 0;
                        figure = L_LEFT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case L_LEFT: {
                if (y4 > 3) {
                    if (arr[x1 - 1][y1 + 1] != 8 && arr[x3 + 1][y3 - 1] != 8 && arr[x4][y4 - 2] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 0;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -2;
                        figure = L_UP;
                    } else if (arr[x1][y1 + 1] != 8 && arr[x3 + 2][y3 - 1] != 8 && arr[x4 + 1][y4 - 2] != 8) {
                        x11 = 0;
                        x22 = 1;
                        x33 = 2;
                        x44 = 1;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -2;
                        figure = L_UP;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }

            }
            break;
            case L_UP: {
                if (y4 > 3) {
                    if (x1 != 9 && arr[x1 - 1][y1 - 1] != 8 && arr[x3 + 1][y3 + 1] != 8 && arr[x4 + 2][y4] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 2;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 0;
                        figure = L_RIGHT;
                    } else if (x4 != 0 && arr[x1 - 2][y1 - 1] != 8 && arr[x2 - 1][y2] != 8) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 0;
                        figure = L_RIGHT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case L_RIGHT: {
                if (y4 > 3) {
                    if (y1 != 23 && arr[x1 + 1][y1 - 1] != 8 && arr[x3 - 1][y3 + 1] != 8 && arr[x4][y4 + 2] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = 0;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 2;
                        figure = L_DOWN;
                    } else if (arr[x1 + 1][y1 - 2] != 8 && arr[x2][y2 - 1] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = 0;
                        y11 = -2;
                        y22 = -1;
                        y33 = 0;
                        y44 = 1;
                        figure = L_DOWN;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;

            case KVADRAT: {
                x11 = 0;
                x22 = 0;
                x33 = 0;
                x44 = 0;
                y11 = 0;
                y22 = 0;
                y33 = 0;
                y44 = 0;
            }
            break;

            case T_DOWN: {
                if (y1 > 4) {
                    if (arr[x1 + 1][y1 - 1] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -1;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = -1;
                        figure = T_LEFT;
                    } else if (x4 != 23 && arr[x3 - 1][y3 + 2] != 8 && arr[x4 - 1][y4] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -1;
                        y11 = 0;
                        y22 = 1;
                        y33 = 2;
                        y44 = 0;
                        figure = T_LEFT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case T_LEFT: {
                if (y1 > 3) {
                    if (x1 != 9 && arr[x1 + 1][y1 + 1] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = 1;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -1;
                        figure = T_UP;
                    } else if (x4 != 0 && arr[x3 - 2][y3 - 1] != 8 && arr[x4][y4 - 1] != 8) {
                        x11 = 0;
                        x22 = -1;
                        x33 = -2;
                        x44 = 0;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = -1;
                        figure = T_UP;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case T_UP: {
                if (y1 > 4) {
                    if (y2 != 23 && arr[x1 - 1][y1 + 1] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 1;
                        y11 = 1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 1;
                        figure = T_RIGHT;
                    } else if (arr[x3 + 1][y3 - 2] != 8 && arr[x4 + 1][y4] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 1;
                        y11 = 0;
                        y22 = -1;
                        y33 = -2;
                        y44 = 0;
                        figure = T_RIGHT;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case T_RIGHT: {
                if (y1 > 5) {
                    if (x1 != 0 && arr[x1 - 1][y1 - 1] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = -1;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 1;
                        figure = T_DOWN;
                    } else if (x4 != 9 && arr[x3 + 2][y3 + 1] != 8 && arr[x4][y4 + 1] != 8) {
                        x11 = 0;
                        x22 = 1;
                        x33 = 2;
                        x44 = 0;
                        y11 = -1;
                        y22 = 0;
                        y33 = 1;
                        y44 = 1;
                        figure = T_DOWN;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;


            case S_HORIZ: {
                if (y1 > 3) {
                    if (y4 != 23 && arr[x1 - 2][y1] != 8 && arr[x4 + 1][y4 + 1] != 8) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = 0;
                        y22 = 1;
                        y33 = 0;
                        y44 = 1;
                        figure = S_VERTIC;
                    } else if (arr[x1 - 2][y1 - 1] != 8 && arr[x2 - 1][y2] != 8) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = -1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 0;
                        figure = S_VERTIC;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case S_VERTIC: {
                if (y1 > 3) {
                    if (x3 != 9 && arr[x1 + 2][y1] != 8 && arr[x4 - 1][y4 - 1] != 8) {
                        x11 = 2;
                        x22 = 1;
                        x33 = 0;
                        x44 = -1;
                        y11 = 0;
                        y22 = -1;
                        y33 = 0;
                        y44 = -1;
                        figure = S_HORIZ;
                    } else if (arr[x1 + 1][y1] != 8 && arr[x4 - 2][y4 - 1] != 8) {
                        x11 = 1;
                        x22 = 0;
                        x33 = -1;
                        x44 = -2;
                        y11 = 0;
                        y22 = -1;
                        y33 = 0;
                        y44 = -1;
                        figure = S_HORIZ;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;


            case Z_HORIZ: {
                if (y1 > 3) {
                    if (y4 != 23 && arr[x1 + 2][y1] != 8 && arr[x4 - 1][y4 + 1] != 8) {
                        x11 = 2;
                        x22 = 1;
                        x33 = 0;
                        x44 = -1;
                        y11 = 0;
                        y22 = 1;
                        y33 = 0;
                        y44 = 1;
                        figure = Z_VERTIC;
                    } else if (arr[x1 + 2][y1 - 1] != 8 && arr[x2 + 1][y2] != 8) {
                        x11 = 2;
                        x22 = 1;
                        x33 = 0;
                        x44 = -1;
                        y11 = -1;
                        y22 = 0;
                        y33 = -1;
                        y44 = 0;
                        figure = Z_VERTIC;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
            case Z_VERTIC: {
                if (y1 > 3) {
                    if (x3 != 0 && arr[x1 - 2][y1] != 8 && arr[x4 + 1][y4 - 1] != 8) {
                        x11 = -2;
                        x22 = -1;
                        x33 = 0;
                        x44 = 1;
                        y11 = 0;
                        y22 = -1;
                        y33 = 0;
                        y44 = -1;
                        figure = Z_HORIZ;
                    } else if (arr[x1 - 1][y1] != 8 && arr[x4 + 2][y4 - 1] != 8) {
                        x11 = -1;
                        x22 = 0;
                        x33 = 1;
                        x44 = 2;
                        y11 = 0;
                        y22 = -1;
                        y33 = 0;
                        y44 = -1;
                        figure = Z_HORIZ;
                    } else {
                        x11 = 0;
                        x22 = 0;
                        x33 = 0;
                        x44 = 0;
                        y11 = 0;
                        y22 = 0;
                        y33 = 0;
                        y44 = 0;
                    }
                } else {
                    x11 = 0;
                    x22 = 0;
                    x33 = 0;
                    x44 = 0;
                    y11 = 0;
                    y22 = 0;
                    y33 = 0;
                    y44 = 0;
                }
            }
            break;
        }


        arr[x1][y1] = 0;
        arr[x2][y2] = 0;
        arr[x3][y3] = 0;
        arr[x4][y4] = 0;
        x1 = x1 + x11;
        x2 = x2 + x22;
        x3 = x3 + x33;
        x4 = x4 + x44;
        y1 = y1 + y11;
        y2 = y2 + y22;
        y3 = y3 + y33;
        y4 = y4 + y44;
        arr[x1][y1] = 1;
        arr[x2][y2] = 1;
        arr[x3][y3] = 1;
        arr[x4][y4] = 1;
    }
}
