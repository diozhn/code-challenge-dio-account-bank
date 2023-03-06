import java.util.Scanner;

public class AccountTerminal {
  private final Scanner scanner = new Scanner(System.in);

  public void createAccount() {
    System.out.println("Please, input your account number");
    int number = this.scanner.nextInt();
    System.out.println("Now, input your account agency");
    String agency = this.scanner.next();
    System.out.println("And, input your account name");
    String clientName = this.scanner.next();
    System.out.println("Finally, Input your account balance");
    double balance = this.scanner.nextDouble();

    System.out.println("Wait a minute, we building your account...");

    System.out.println("Hello " + clientName + ", thank you for create account in our bank, your agency is " + agency + ", account " + number + " and your balance " + balance + " is already available for withdraw.");
  }
}
