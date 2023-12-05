import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    public void testValidPaleteSize(){
        ColourTable table = new ColourTable(4);
        assertEquals(4,table.getPaletteSize());
    }

    @Test
    public void testInValidPaleteSizeOne(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(5));
    }

    @Test
    public void testInvalidPaleteSizeTwo(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-1));
    }

    @Test
    public void testInvalidPaleteSizeThree(){
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1025));
    }

}
