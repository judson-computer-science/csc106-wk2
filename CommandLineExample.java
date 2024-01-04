public class CommandLineExample {

  public static void main(String[] args) {

    // Check the number of command line parameters
    if (args.length == 0) {
      System.out.println("No command line parameters were provided.");
    } else {
      System.out.println("Number of command line parameters: " + args.length);
    }
  }
}

