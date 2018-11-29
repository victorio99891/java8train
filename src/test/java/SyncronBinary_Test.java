import org.junit.Before;
import org.junit.Test;
import pl.wiktor.SyncronBinary;

import static org.junit.Assert.assertEquals;

public class SyncronBinary_Test {

    SyncronBinary syncronBinary;

    @Before
    public void initialize() {
        syncronBinary = new SyncronBinary();
    }

    @Test
    public void testFinalValue() {
        Integer decimal = 3;
        String binary = "1100";

        assertEquals(decimal, syncronBinary.convertBintoDecReversed(binary));
    }

}
