/**
 * The Quiz class represents a quiz, extending the Assessment class.
 */

public class Quiz extends Assessment
{
    /**
     * Constructs a Quiz with the specified total and score.
     *
     * @param total, total possible score for the quiz
     * @param score, score obtained in the quiz
     */
    public Quiz(int total, int score)
    {
        super(total, score); // Call the constructor of the superclass
    }

    /**
     * Returns a string representation of the Quiz object
     *
     * @return string describing the quiz score and total score
     */
    public String toString()
    {
        return "Quiz score = " + score + "\nTotal = " + total;
    }
}
