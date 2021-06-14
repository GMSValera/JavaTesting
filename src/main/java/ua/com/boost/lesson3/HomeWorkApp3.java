package ua.com.boost.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString( change0to1( new int[] {1,1,0,0,1,0,1,1,0,0})));
        System.out.println(Arrays.toString( fillArray(100)));
        System.out.println(Arrays.toString( change6( new int[] {1,5,3,2,11,4,5,2,4,8,9,1})));
        fillDiagonal(10);
        System.out.println(Arrays.toString( fillArrayWithValue(100, 255)));
    }

    private static int[] change0to1(final int[] source) {
        for (int i=0; i<source.length; i++) {
            if (source[i] == 0) {
                source[i] = 1;
            } else {
                source[i] = 0;
            }
        }
        return source;
    }

    private static void fillDiagonal(final int arraylength) {
        int[][] targetArray = new int[arraylength][arraylength];

        for (int i=0; i<arraylength; i++) {
            for (int j=0; j<arraylength; j++) {
                if ((i==j) || (j == arraylength-i-1) ) {
                    targetArray[i][j] = 1;
                }
                System.out.print( targetArray[i][j]+" ");
            }
            System.out.println( );
        }
    }

    private static int[] fillArray(final int arraylength) {
        int[] targetArray = new int[arraylength];

        for (int i=0; i<arraylength; i++) {
            targetArray[i] = i+1;
        }
        return targetArray;
    }

    private static int[] fillArrayWithValue(final int arraylength, final int initialValue) {
        int[] targetArray = new int[arraylength];

        for (int i=0; i<arraylength; i++) {
            targetArray[i] = initialValue;
        }
        return targetArray;
    }

    private static int[] change6(final int[] source) {
        for (int i=0; i<source.length; i++) {
            if (source[i] < 6) {
                source[i] = source[i] * 2;
            }
        }
        return source;
    }

}
