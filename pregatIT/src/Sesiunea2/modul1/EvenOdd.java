package Sesiunea2.modul1;

public class EvenOdd {
    public static void checkEvenOdd(int number) {

    if (number % 2 == 0) {
        System.out.println(number + " is even.");

    } else {

        System.out.println(number + " is odd.");

    }
}

    public static void main(String[] args){
        EvenOdd.checkEvenOdd(4);
        EvenOdd.checkEvenOdd(9);
        EvenOdd.checkEvenOdd(10);

    }
}
