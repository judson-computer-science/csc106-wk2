public class PrintMethods {

  public static void main(String[] args) {
    int value = 1234; // declare and initialize an integer variable

    // use printf() to print the value with a specified number of decimal places
    System.out.printf("The value is: %d\n", value);

    // use print() to print the value without a newline character at the end
    System.out.print("The value is: " + value);

    // explicitly include a newline character when calling print()
    System.out.print("\n");

    // use println() to print the value with a newline character at the end
    System.out.println("The value is: " + value);
  }
}
