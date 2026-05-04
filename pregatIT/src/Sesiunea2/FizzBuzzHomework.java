package Sesiunea2;

public class FizzBuzzHomework {
    public static void VerificaNumar(int numar) {
        if (numar % 3 == 0 && numar % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numar % 3 == 0) {
            System.out.println("Fizz");
        } else if (numar % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numar);
        }
    }


    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            VerificaNumar(i);
        }

    }
}