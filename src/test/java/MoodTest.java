import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.MoodAnalyzer;

public class MoodTest {
    // TC 1.1: test for sad mood
    @Test
    public void testSadMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in a Sad Mood");
        assertEquals("SAD", analyzer.analyzeMood());
    }

    // TC 1.2: test for happy mood
    @Test
    public void testHappyMood() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY", analyzer.analyzeMood());
    }

    // TC 2.1: testing for null mood message
    @Test
    public void testNullMoodMessage() {
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        assertEquals("HAPPY", analyzer.analyzeMood());
    }
}