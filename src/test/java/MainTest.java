import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    @Test
    public void verifyNoExceptionThrown() {
        // Simulated user input: "1000\n5\n2\n4\n"
        String simulatedInput = "1000\n5\n2\n4\n";
        InputStream originalSystemIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            Main.main(new String[]{});
        } finally {
            System.setIn(originalSystemIn); // Restore System.in after the test
        }
    }
}
