public class Main {
    public static void main(String[] args) {

        // initializing variables needed for the For Statement
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for(int i = 1; i <= 1000; i++) { // For Statement setting our parameters

            if ((i % 3 == 0) && (i % 5 == 0)) { // Tests to see if a number is divisible by 3 or 5
                countOfMatches ++;
                sumOfMatches += i;

                System.out.println(i + " is divisible by 3 or 5!");
            }

            if(countOfMatches == 5) { // Finds when there have been 5 matches
                break;
            }

        }

        System.out.println(sumOfMatches + " is the total sum of the first five numbers that are divisible by 3 or 5"); // This command prints the total sum of all matches

    }
}
