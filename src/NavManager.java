import java.sql.SQLOutput;
import java.util.Scanner;

public class NavManager {

    public static NavManager shared = new NavManager();
//    PPMInput input = new PPMInput();
//    private Scanner scanner = null;
    private Scanner kbScanner = null;

    /**
     * Menu for the top level of the program
     */
    public void startProgram() {

        System.out.println("Please select an option: ");
        System.out.println("1. Create an album from directory");
        System.out.println("2. Read an individual file");
        System.out.println("3. Display an image");
        System.out.println("4. Exit the program");

        switch (getKBScanner().nextInt()) {
            case 1: break;
            case 2:
                readFile();
                break;
            case 3: break;
            case 4:
                System.exit(0);
                break;
            default:
            System.out.println("Please enter an Integer 1 through 4!");
            NavManager.shared.startProgram();
        }
    }

    public void manipulationMenu(String fileName) {
        System.out.println("Please select an option:");
        System.out.println("1. Swap red and blue color values");
        System.out.println("2. Convert to grayscale");
        System.out.println("3. Flip the image(s)");
        System.out.println("4. Flop the image(s)");
        System.out.println("5. Invert the image(s)");
        System.out.println("6. Return to the main menu");
        System.out.println("7. Exit the program");

        switch (getKBScanner().nextInt()) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6:
                NavManager.shared.startProgram();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Please enter an Integer 1 through 4!");
                NavManager.shared.manipulationMenu(fileName);
        }
    }

    /**
     * @return - Returns the Scanner instance used for getting keyboard input inside of the NavManager
     */
    private Scanner getKBScanner() {
        if (kbScanner != null) {
            return kbScanner;
        }
        Scanner localScanner = new Scanner(System.in);
        return localScanner;
    }

    /**
     * Gets a user specified filename and calls the manipulation menu
     */
    public void readFile() {
        System.out.println("Please enter a filename (without the extension): ");
        String fileName = getKBScanner().nextLine() + ".ppm";
        NavManager.shared.manipulationMenu(fileName);
    }
}
