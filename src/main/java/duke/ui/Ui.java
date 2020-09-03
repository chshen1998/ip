package duke.ui;

import java.util.Scanner;

/**
 * Deals the interactions with the user.
 */
@SuppressWarnings("checkstyle:Regexp")
public class Ui {
    public static final String LINE = "_______________________________________\n";
    private Scanner scanner;

    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Reads in input from user.
     *
     * @return the input from user.
     */
    public String getUserInput() {
        return this.scanner.nextLine();
    }

    /**
     * Greets the user.
     * Runs when program is opened.
     */
    public void welcome() {
        String open = "_______________________________________ \n"
                + "Hello! I'm duke.Duke \n"
                + "What can I do for you? \n"
                + "_______________________________________ \n";
        System.out.println(open);
    }

    /**
     * Says goodbye to user.
     * Runs when program is closed.
     */
    public void goodbye() {
        String close = "_______________________________________ \n"
                + "Goodbye! See you soon! \n"
                + "_______________________________________ \n";
        System.out.println(close);
        this.scanner.close();
    }

    /**
     * Prints Duke's response with dividing lines
     *
     * @param response
     */
    public void printResponse(String response) {
        if (response.equals(" ")) {
            // Dont print anything
        } else {
            System.out.println(LINE + response + "\n" + LINE);
        }
    }
}
