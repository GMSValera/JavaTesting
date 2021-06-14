package ua.com.boost.lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println( Check1( 8, 3 ) );
        Check2( -5 );
        System.out.println( Check3( 5 ) );
        System.out.println( printSomeTimes("Test", 5));
        System.out.println( isLeapYear(396) );
    }

    public static boolean Check1( int a, int b){
        return ((a+b>=10) && (a+b<=20));
    }

    public static void Check2( int a){
        if (a>=0){
            System.out.println("Положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static boolean Check3( int a){
        return (a<0);
    }

    public static String printSomeTimes( String str, int count){
        String tempStr="";

        for (int i=1; i<=count; i++) {
            tempStr = tempStr + str;
        }

        return tempStr;
    }

    public static boolean isLeapYear( int year){
        return ( year % 4 ==0 ) && (( year%100 != 0 ) || ( year % 400 ==0 ));
    }

}
