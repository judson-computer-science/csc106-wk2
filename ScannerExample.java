import java.util.Scanner; // import the Scanner class

public class ScannerExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // create a new Scanner object

    // prompt the user to enter their name
    System.out.println("Please enter your name: ");

    // read the user's name from the command line
    String name = scanner.nextLine();

    // print a message to the user
    System.out.println("Hello, " + name + "!");

    scanner.close(); // close the Scanner object
  }
}

