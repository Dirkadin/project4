import java.util.*;

/**
 * This class represents an Image
 */
public abstract class Image implements ImageReader, ImageWriter {

    private int width;
    private int height;
    private ArrayList<ArrayList<Pixel>> theImage = new ArrayList<ArrayList<Pixel>>();

    public Pixel getPixel(int x, int y) {
        return theImage.get(x).get(y);
    }

    public void placePixel(Pixel thePixel, int column) {
        this.theImage.get(column).add(thePixel);
    }

    private class Pixel {

        int red;
        int green;
        int blue;

        private Pixel(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //    /**
//     * These private variables provide the width and height of the image and the two dimensional array to represent the image
//     */
//    private int width;
//    private int height;
//    private List<List<Pixel>> ourImage;
//
//    /**
//     * Reads in data from a .ppm file into an image
//     *
//     * @param fileName - The name of the file read from
//     */
//    public abstract void read(String fileName);
//
//    /**
//     * Writes an Image to a .ppm file
//     *
//     * @param fileName - The name of the file to write to
//     */
//    public abstract void write(String fileName);
//
//    public void addPixel(String r, String g, String b) {
//
//    }
//
//
//    /**
//     * @param width - Sets the width of the Image
//     */
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    /**
//     * @param height - Sets the height of the Image
//     */
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    /**
//     * @return - Returns the width of the image
//     */
//    public int getWidth() {
//        return width;
//    }
//
//    /**
//     * @return - Returns the height of the image
//     */
//    public int getHeight() {
//        return height;
//    }
//
//    /**
//     *  represents one RGB pixel
//     */
//    private class Pixel {
//
//        int red;
//        int green;
//        int blue;
//
//        /**
//         * Public constructor for the Pixel inner class.
//         */
//        public Pixel(int red, int green, int blue) {
//            this.red = red;
//            this.green = green;
//            this.blue = blue;
//        }
//
//    }

}
