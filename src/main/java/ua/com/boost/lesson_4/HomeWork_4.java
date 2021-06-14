package ua.com.boost.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_4 {

    public static int SIZE = 6;
    public static int DOTS_TO_WIN = 5;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        int quantityX,quantityY,quantityD;

        /* подсчет точек по горизонтали, вертикали и диагонали */
        for (int i=0; i < SIZE; i++) {
            for (int j=0; j < SIZE; j++) {
                quantityX = 0;
                quantityY = 0;
                quantityD = 0;
                for (int c=0; c < DOTS_TO_WIN; c++) {
                    if ((j+c<SIZE) && (map[i][j+c] == symb)) quantityX++;
                    if ((i+c<SIZE) && (map[i+c][j] == symb)) quantityY++;
                    if ((i+c<SIZE) && (j+c < SIZE) && (map[i+c][j+c] == symb)) quantityD++;
                }
                if (quantityX == DOTS_TO_WIN) return  true;
                if (quantityY == DOTS_TO_WIN) return  true;
                if (quantityD == DOTS_TO_WIN) return  true;
            }
        }
        return false;

    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y, quantityX,quantityY,quantityD;

        /* мешаем ходу при одном до победного DOTS_TO_WIN-1 */
        for (int i=0; i < SIZE; i++) {
            for (int j=0; j < SIZE; j++) {
                quantityX = 0;
                quantityY = 0;
                quantityD = 0;
                for (int c=0; c < DOTS_TO_WIN; c++) {
                    if ((j+c<SIZE) && (map[i][j+c] == DOT_X) && (j+c+1<SIZE)) {
                        quantityX++;
                        if ((quantityX == DOTS_TO_WIN-1) && isCellValid( i, j+c+1))  {
                            System.out.println("Компьютер походил в точку для блокировки " + (i + 1) + " " + (j+c+1 + 1));
                            map[i][j+c+1] = DOT_O;
                            return;
                        }
                    };
                    if ((i+c<SIZE) && (map[i+c][j] == DOT_X) && (i+c+1<SIZE)) {
                        quantityY++;
                        if ((quantityY == DOTS_TO_WIN-1) && isCellValid( i+c+1, j)) {
                            System.out.println("Компьютер походил в точку для блокировки " + (i + c + 1 + 1) + " " + (j + 1));
                            map[i + c + 1][j] = DOT_O;
                            return;
                        }
                    };
                    if ((i+c<SIZE) && (j+c < SIZE) && (map[i+c][j+c] == DOT_X) && (i+c+1<SIZE) && (j+c+1<SIZE)) {
                        quantityD++;
                        if ((quantityD == DOTS_TO_WIN-1) && isCellValid( i+c+1, j+c+1)) {
                            System.out.println("Компьютер походил в точку для блокировки " + (i + c + 1 + 1) + " " + (j + c + 1 + 1));
                            map[i + c + 1][j + c + 1] = DOT_O;
                            return;
                        }
                    };
                }
            }
        }

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате Y X");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

