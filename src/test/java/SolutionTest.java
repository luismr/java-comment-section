import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    
    @Test
    void testExample() {
        // Add your test cases here
        assertTrue(true, "This is a placeholder test");
    }

    @Test
    void testExampleFromReadme() {
        String[] comments = {
            "This is a great solution",
            "The solution works well",
            "Not related to solutions"
        };
        assertEquals(2, Solution.solution(3, "solution", comments));
    }

    @Test
    void testCaseInsensitive() {
        String[] comments = {
            "SOLUTION is here",
            "This is a Solution",
            "No match here"
        };
        assertEquals(2, Solution.solution(3, "solution", comments));
    }

    @Test
    void testEmptyComments() {
        String[] comments = {};
        assertEquals(0, Solution.solution(0, "solution", comments));
    }

    @Test
    void testNullComments() {
        assertEquals(0, Solution.solution(0, "solution", null));
    }

    @Test
    void testNullSearchWord() {
        String[] comments = {"Some comment"};
        assertEquals(0, Solution.solution(1, null, comments));
    }

    @Test
    void testEmptySearchWord() {
        String[] comments = {"Some comment"};
        assertEquals(0, Solution.solution(1, "", comments));
    }

    @Test
    void testNoMatches() {
        String[] comments = {
            "First comment",
            "Second comment",
            "Third comment"
        };
        assertEquals(0, Solution.solution(3, "solution", comments));
    }

    @Test
    void testAllMatches() {
        String[] comments = {
            "solution one",
            "solution two",
            "solution three"
        };
        assertEquals(3, Solution.solution(3, "solution", comments));
    }
} 