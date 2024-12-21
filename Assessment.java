/**
 * This is a public class to evaluate our assignment Marks
 *
 */

public class Assessment

{
    protected int total;
    protected int score;

    /**
     * Constructs an Assessment with user provided total and score
     *
     * @param total, max possible score
     * @param score, obtained score
     */
    public Assessment(int total, int score)
    {
        this.total = total;
        this.score = score;
    }

    /**
     * Returns the total possible Score of the assessment
     *
     * @return total possible score
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Returns user obtained scor
     *
     * @return obtained score
     */
    public int getScore()
    {
        return score;
    }

    /* Regression Test for this.Class */

    /**
     * This class is used to perform regression tests on the Assessment class
     */

    public class AssessmentTest
    {
        /**
         * Main method to run the tests.
         * 
         */
        public static void main(String[] args) // Main method
        {
            runTests();
        }

        /**
         * Runs all test methods for the Assessment class.
         */
        private static void runTests()
        {
            testConstructorInitialization();
            testGetScore();
            testGetTotal();
        }

        /**
         * Tests the constructor of the Assessment class.
         */
        private static void testConstructorInitialization()
        {
            Assessment assessment = new Assessment(100, 100);
            equalCheck(100, assessment.score, "Constructor not correctly initializing score class variable.");
            equalCheck(100, assessment.total, "Constructor not correctly initializing total class variable.");
        }

        /**
         * Tests the getScore method
         */
        private static void testGetScore()
        {
            Assessment assessment = new Assessment(100, 100);
            equalCheck(100, assessment.getScore(), "getScore method not returning correct value.");
        }

        /**
         * Tests the getTotal method of the Assessment class.
         */
        private static void testGetTotal()
        {
            Assessment assessment = new Assessment(100, 100);
            equalCheck(100, assessment.getTotal(), "getTotal method not returning correct value.");
        }

        /**
         * Checks if the expected value equals the actual value and prints the result.
         *
         * @param expected ,the expected value
         * @param actual ,the actual value
         * @param message ,the message to display if the test fails or passes
         */
        private static void equalCheck(int expected, int actual, String message)
        {
            if (expected != actual)
            {
                System.out.println("Test failed: " + message);
            } else
            {
                System.out.println("Test passed: " + message);
            }
        }
    }



}