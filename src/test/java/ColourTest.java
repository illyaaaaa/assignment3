import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    public void testValidPaleteSize(){
        ColourTable table = new ColourTable(4);
        assertEquals(4,table.getPaletteSize());
    }

    @Test
    public void testInValidPaleteSize(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(5));
    }

    @Test
    public void testInvalidPaleteSizeUnderBounds(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
    }

    @Test
    public void testInvalidPaleteSizeAboveBounds(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1025));
    }

    @Test
    public void testInvalidPaleteSizeNotPowerOfTwo(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(7));
    }

}
