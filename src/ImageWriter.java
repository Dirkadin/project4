/**
 * This interface writes an Image to a .ppm file
 */
public interface ImageWriter {

    /**
     * Writes an Image to a .ppm file
     *
     * @param fileName - The name of the file to write to
     */
    public void write(String fileName);

}
