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

    }
}
