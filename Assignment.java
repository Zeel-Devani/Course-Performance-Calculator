/**
 * The Assignment class represents a specific type of assessment,
 * extending the Assessment class.
 */

public class Assignment extends Assessment
{
    /**
     * Constructs an Assignment with the specified total and score.
     *
     * @param total the total possible score for the assignment
     * @param score the score obtained in the assignment
     */
    public Assignment(int total, int score)
    {
        super(total, score); // Call the constructor of the superclass
    }

    /**
     * Returns a string representation of the Assignment object,
     * including the score and total score.
     *
     * @return a string describing the assignment score and total score
     */
    public String toString()  // Construct and return a formatted string with score and total
    {
        return "Assignment score: " + score + "\nTotal score: " + total;
    }
}
