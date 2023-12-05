import java.util.Arrays;
public class ColourTable {
    private int paletteSize;
    private int[][] palette;

    public ColourTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new IllegalArgumentException("Invalid palette size. Must be a power of two and between 2 and 1024.");
        }
        this.paletteSize = paletteSize;
        this.palette = new int[paletteSize][3];
    }

    public int getPaletteSize() {
        return paletteSize;
    }

    public boolean isValidPaletteSize(int size){
        return size > 1 && (size & (size - 1)) == 0 && size < 1025;
    }

    public void add(int[] rgbColour){
        if (!isValidRGB(rgbColour)){
            throw new IllegalArgumentException("Invalid RGB Format. Must be between 0-255");
        }
    }
    public boolean isValidRGB(int[] rgbColour){
        return Arrays.stream(rgbColour).allMatch(value -> value >= 0 && value <= 255);
    }
}
