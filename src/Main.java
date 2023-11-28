import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = (int) (Math.random() * 10000);
        String transactions = "1.Transaction : Balance learning\n"
                            + "2.Transaction : Withdraw money\n"
                            + "3.Transaction : Deposit money\n"
                            + "For Exit : E ";
        System.out.println("*********************************");
        System.out.println(transactions);
        System.out.println("*********************************");

        while (true) {
            System.out.print("Select Transaction : ");
            String transaction = scanner.nextLine();
            if (transaction.equals("E")) {
                System.out.println("Exiting the program");
                break;
            } else if (transaction.equals("1")) {
                System.out.println("Your balance : " + balance);

            } else if (transaction.equals("2")) {
                System.out.print("The amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                if (balance - amount < 0) {
                    System.out.println("Not enough balance to withdraw " + balance);
                } else {
                    balance -= amount;
                    System.out.println("Your new balance : " + balance);
                }
            } else if (transaction.equals("3")) {
                System.out.print("The amount you want to deposit : ");
                int deposit = scanner.nextInt();
                scanner.nextLine();
                balance += deposit;
                System.out.println("Your new balance : " + balance);
            } else {
                System.out.println("Invalid transaction");
            }


        }
    }
}