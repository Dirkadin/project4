/**
 * This interface reads an Image from a .ppm file
 */
public interface ImageReader {

    /**
     * Reads in data from a .ppm file into an image
     *
     * @param fileName - The name of the file read from
     */
    public void read(String fileName);

}
