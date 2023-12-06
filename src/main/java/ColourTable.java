import java.util.Arrays;

public class ColourTable {
    private int paletteSize;
    private int[][] palette;
    private int coloursAdded;

    public ColourTable(int paletteSize) {
        if (!isValidPaletteSize(paletteSize)) {
            throw new IllegalArgumentException("Invalid palette size. Must be a power of two and between 2 and 1024.");
        }
        this.paletteSize = paletteSize;
        this.palette = new int[paletteSize][3];
        this.coloursAdded = 0;
    }

    public int getPaletteSize() {
        return paletteSize;
    }

    public boolean isValidPaletteSize(int size) {
        return size > 1 && (size & (size - 1)) == 0 && size < 1025;
    }

    public void add(int[] rgbColour) {
        if (!isValidRGB(rgbColour)) {
            throw new IllegalArgumentException("Invalid RGB Format. Must be between 0-255");
        }

        if (isColorInPalette(rgbColour)) {
            throw new IllegalArgumentException("Color already exists in the palette.");
        }

        if (isPaletteFull()) {
            throw new IllegalArgumentException("Exceeded the capacity of the ColourTable.");
        }

        palette[coloursAdded] = Arrays.copyOf(rgbColour, 3);
        coloursAdded++;
    }

    public boolean isPaletteFull() {
        return coloursAdded == paletteSize;
    }

    private boolean isColorInPalette(int[] rgbColour) {
        for (int i = 0; i < coloursAdded; i++) {
            if (Arrays.equals(palette[i], rgbColour)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidRGB(int[] rgbColour) {
        return Arrays.stream(rgbColour).allMatch(value -> value >= 0 && value <= 255) ;
    }

    public int[][] getPalette() {
        return palette;
    }
}

