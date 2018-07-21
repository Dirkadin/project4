import java.util.*;

public class PPM extends Image {

    public PPMInput input = null;
    public Scanner scanner = null;

    public PPM() {
        super();
        if (!scanner.nextLine().equals("P3")) {
            System.out.println("This is not a P3 file!");
        }
        String sizeString = scanner.nextLine();
        String[] sizeStringArray = sizeString.split(" ");
        int width = Integer.parseInt(sizeStringArray[0]);
        int height = Integer.parseInt(sizeStringArray[1]);
        super.setWidth(width);
        super.setHeight(height);
    }


    @Override
    public void read(String fileName) {

//        if (input == null || scanner == null) {
//            input = new PPMInput(fileName);
//            scanner = input.getReader();
//        }
//
//        if (!scanner.nextLine().equals("P3")) {
//            return;
//        }
    }

    @Override
    public void write(String fileName) {

    }

    private Scanner getScanner(String fileName) {
        if (scanner != null) {
            return scanner;
        } else {
            PPMInput input = new PPMInput(fileName);
            return input.getReader();
        }
    }


}
