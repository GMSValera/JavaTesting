package ua.com.boost.test;

public class lesson2 {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4", "5"}, {"3", "4", "5", "6"}, {"4", "5", "6", "7"}};
        try {
            try {
                int sum = sumArray(arr);
                System.out.println("Сумма:"+sum);
            } catch (MyArraySizeException error) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException error) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + (error.getX()+1) + "x" + (error.getY()+1));
        }

    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }

}
