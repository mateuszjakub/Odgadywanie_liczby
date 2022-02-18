import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int guessingNumber;
        int randomisedNumber;

        randomisedNumber = randomiseNumber(100);
        System.out.println("Odgadnij o jakiej liczbie od 1 do 100 myślę");
        System.out.println("Wpisz liczbę:");

        do {
            Scanner scan = new Scanner(System.in);
            guessingNumber = scan.nextInt();

            if (guessingNumber > randomisedNumber) {
                System.out.println("Mniej");
            } else if (guessingNumber < randomisedNumber){
                System.out.println("Więcej");
            }
        }
            while (guessingNumber != randomisedNumber);

        System.out.println("Brawo!");
    }


    private static int randomiseNumber(int max) {
        return (int) (Math.random()*max);
    }
}
