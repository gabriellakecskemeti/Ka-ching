import java.util.Scanner;

public class KidsCountingGame {
    public static void main(String[] args) {
        int i=0;
        System.out.println("This program counts numbers and writes ka for every multiple of 3, " +
                "it writes ching for every multiple of 5." );
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        // asking  the last number
        int maxNumber=0;
        System.out.println("please enter the number to which you want to count. \nThe possible highest number is 2147483647: ");
        try {
            maxNumber = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException e) {
            System.out.println("Not valid number, GAME OVER!");
            return;
        }

        if (maxNumber < 1) {
            System.out.println("Not valid number, GAME OVER!");
            return;
        }

        // loop for counting all numbers.
        while (i<=maxNumber){
            System.out.println(counter(i));
            i++;
        }

    }

    /**
     * This method applies the rules of the ka-ching game and calculates for every number
     * "ka" if it multiple of 3 and
     * "ching" if it multiple of 5 and
     * "ka-ching" if multiple of 5 and 3.
     *
     * @param i = int value
     * @return String value including the result of calculation
     */
    static String counter(int i){
        if (i % 3 == 0 && i % 5 == 0) {
            return "ka-ching";
        } else if (i % 5 == 0) {
            return "ching";
        } else if (i % 3 == 0) {
            return "ka";
        } else {
            return Integer.toString(i);
        }
    }


}


