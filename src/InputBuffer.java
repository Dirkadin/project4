import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Reads the current message that is being translated from FileInputStream
// Determine which subclass to use by file type

/**
 * Abstract class that represents input for the program.
 */
public abstract class InputBuffer {

    /**
     * Variable for our ONE scanner.
     */
    private Scanner reader = null;

    /**
     * Constructor for getting input.
     *
     * @param inputFile The filename of the file we want to translate.
     */
    public InputBuffer(String inputFile) {

        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            reader = new Scanner(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
            System.exit(-1);
        }
    }

    /**
     * Determines if we are at the end of the file.
     *
     * @return Returns true if we are at the end of the file.
     */
    public boolean endOfBuffer() {
        if (reader.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Gets the ONE scanner for the rest of the program to pull from.
     *
     * @return Returns the ONE scanner for the program.
     */
    public Scanner getReader() {
        return reader;
    }

    /**
     * Closes the open Scanner file.
     */
    public void close() {
        try {
            reader.close();
        } catch (Exception e) {
            System.out.println("There was a problem closing the file: " + e);
            System.exit(-1);
        }
    }

}
