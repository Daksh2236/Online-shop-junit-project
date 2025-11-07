

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void addComment()
    {
    }

    @Test
    public void correctlyStoredTest()
    {
        Comment comment2 = new Comment("Ron", "hi", 4);
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.downvote();
    }

    @Test
    public void author()
    {
        Comment comment1 = new Comment("johnathan", "story", 2);
        assertEquals("johnathan", comment1.getAuthor());
    }

    @Test
    public void rating()
    {
        Comment comment2 = new Comment("Ron", "hi", 4);
        assertEquals(4, comment2.getRating());
    }
}




