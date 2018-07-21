import java.util.Scanner;

public class NavManager {

    public static NavManager shared = new NavManager();
//    PPMInput input = new PPMInput();
    Scanner scanner = null;

    private NavManager() {



    }

    public void startProgram() {

        System.out.println("Please select an option: ");
        System.out.println("1. Create an album from directory");
        System.out.println("2. Read an individual file");
        System.out.println("3. Display an image");
        System.out.println("4. Exit the program");

        switch (kbScanner().nextInt()) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4:
                System.exit(0);
                break;
            default:
            System.out.println("Please enter an Integer 1 through 4!");
            NavManager.shared.startProgram();
        }


    }

    private Scanner kbScanner() {
        return new Scanner(System.in);
    }
}
