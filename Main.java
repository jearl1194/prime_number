import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operator = 0;
        while (operator != 3) {
            while (true) {
                System.out.println("[1] Prime or Composite");
                System.out.println("[2] All Prime Numbers");
                System.out.println("[3] Exit");
                System.out.print("Choose an option: ");
                operator = input.nextInt();
                if (operator == 1 || operator == 2 || operator == 3) {
                    break;
                } else {
                    System.out.println("Invalid input");
                    System.out.println("\n");
                }
            }
            if (operator == 1) {
                String prime_or_composite = "Prime";
                System.out.print("\nEnter an integer: ");
                int input_num = input.nextInt();
                if (input_num == 0 || input_num == 1) {
                    prime_or_composite = "Neither Prime nor Composite";
                } else if (input_num < -1) {
                    prime_or_composite = "Composite";
                } else if (input_num >= 2) {
                    for (int div = 2; div < input_num; div++) {
                        if (input_num % div == 0) {
                            prime_or_composite = "Composite";
                            break;
                        }
                    }
                }
                System.out.println(prime_or_composite);
                System.out.println("\n");
            } else if (operator == 2) {
                String prime = "";
                System.out.print("\nEnter integer 1: ");
                int input_num_1 = input.nextInt();
                System.out.print("Enter integer 2: ");
                int input_num_2 = input.nextInt();
                for (; input_num_1 <= input_num_2; input_num_1++) {
                    boolean is_prime = true;
                    if (input_num_1 >= 2) {
                        for (int div = 2; div < input_num_1; div++) {
                            if (input_num_1 % div == 0) {
                                is_prime = false;
                                break;
                            }
                        }
                    } else if (input_num_1 < 2) {
                        is_prime = false;
                        if (input_num_1 == -1) {
                            is_prime = true;
                        }
                    }
                    if (is_prime) {
                        if (!prime.isBlank()) {
                            prime += ", ";
                            prime += Integer.toString(input_num_1);
                        } else {
                            prime += Integer.toString(input_num_1);
                        }
                    }
                }
                System.out.println(prime);
                System.out.println("\n");
            }
        }
        input.close();
    }
}