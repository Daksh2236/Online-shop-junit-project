

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
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
    public void testComment()
    {
        SalesItem salesIte1 = new SalesItem("d", 0) ;
        assertEquals(false, salesIte1.addComment("jake", "rara", 0));
    }


    @Test
    public void findMostHelpfulCommentTest()
    {
        SalesItem salesIte1 = new SalesItem("bike", 100);
        salesIte1.addComment("Jake", "don't like the bike", 1);
        salesIte1.addComment("Jeff", "love the bike", 5);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        Comment comment1 = salesIte1.findMostHelpfulComment();
    }

    @Test
    public void findMostHelpfulCommentWithNoComment()
    {
        SalesItem salesIte1 = new SalesItem("bike", 50);
    }

    @Test
    public void testUpVoteWithNoComments()
    {
        SalesItem salesIte1 = new SalesItem("bike", 50);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(1);
    }
}







