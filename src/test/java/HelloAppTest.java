import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class HelloAppTest {

    @Test
    public void testDefaultGreeting() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        HelloApp.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertEquals("Hello, World!", output);
    }

    @Test
    public void testPersonalizedGreeting() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        HelloApp.main(new String[]{"Alice"});

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertEquals("Hello, Alice!", output);
    }

    @Test
    public void testMultipleNamesGreeting() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        HelloApp.main(new String[]{"Alice", "Bob", "Charlie"});

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        assertEquals("Hello, Alice, Bob, Charlie!", output);
    }
}