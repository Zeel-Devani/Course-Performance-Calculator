/**
 * The FinalExam class represents a final exam, extending the Exam class.
 */

public class FinalExam extends Exam
{
    /**
     * Constructs a FinalExam with the specified total and score.
     *
     * @param total, total possible score for the final exam
     * @param score, score obtained in the final exam
     */
    public FinalExam(int total, int score)
    {
        super(total, score); // Call the constructor of the superclass
    }

    /**
     * Returns a string representation of the FinalExam object.
     *
     * @return string describing the final exam score and total score
     */
    public String toString()
    {
        return "Final Exam score= " + score + "\n Total score= " + total;
    }
}
