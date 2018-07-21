import java.util.Scanner;

public class NavManager {

    public static NavManager shared = new NavManager();
//    PPMInput input = new PPMInput();
    private Scanner scanner = null;
    private Scanner kbScanner = null;

    private NavManager() {



    }

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

    private Scanner getKBScanner() {
        if (kbScanner != null) {
            return kbScanner;
        }

        Scanner localScanner = new Scanner(System.in);

        return localScanner;
    }

    public void readFile() {
        System.out.println("Please enter a filename");
        String fileName = getKBScanner().nextLine() + ".ppm";
        System.out.println(fileName);
    }
}
