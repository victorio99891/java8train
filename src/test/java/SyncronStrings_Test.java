import org.junit.Before;
import org.junit.Test;
import pl.wiktor.SyncronStringsUsingLambdas;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class SyncronStrings_Test {

    private SyncronStringsUsingLambdas stringsTest;

    @Before
    public void initialize() {
        stringsTest = new SyncronStringsUsingLambdas();
    }

    @Test
    public void testResult() {
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.addLast("a");
        deque1.addLast("b");
        deque1.addLast("c");
        Deque<String> deque2 = new ArrayDeque<>();
        deque2.addLast("d");
        deque2.addLast("e");
        deque2.addLast("f");

        String good = "adbecf";

        assertEquals(stringsTest.convertIntoOneList.apply(deque1, deque2), good);
    }


}
