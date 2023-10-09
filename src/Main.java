import java.util.Scanner;

public class Main {
    static double[] rectInfo = new double[2];

    public static void main(String[] args) {
        getInput("What is the length of the first side?", 0);
        getInput("What is the length of the second side?", 1);

        System.out.printf("%-40s %.02f\n", "The area of your rectangle is:", rectInfo[0] * rectInfo[1]);
        System.out.printf("%-40s %.02f", "The perimeter of your rectangle is:", (rectInfo[0] * 2) + (rectInfo[1]*2));
    }

    private static void getInput(String question, int outputIndex) {
        Scanner scanner = new Scanner(System.in);
        boolean verify = false;

        do {
            System.out.println(question);

            if (scanner.hasNextDouble()) {
                rectInfo[outputIndex] = scanner.nextDouble();

                if (rectInfo[outputIndex] <= 0) {
                    System.out.println("The length of a side should not be greater than 0.");
                } else {
                    verify = true;
                }
            } else {
                System.out.println("Please enter a valid input using numbers.");
            }
            scanner.nextLine();
        } while (!verify);
    }
}