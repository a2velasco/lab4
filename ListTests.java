import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>();
        input.add("this");
        input.add("test");
        input.add("pass?");

        assertEquals(new ArrayList<String>(){}, ListExamples.filter(input));

    }
    
}
