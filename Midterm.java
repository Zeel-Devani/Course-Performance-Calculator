/**
 * The Midterm class represents a midterm exam, extending Exam class.
 */
public class Midterm extends Exam
{
    /**
     * Constructs a Midterm with the specified total and score.
     *
     * @param total, total possible score for the midterm exam
     * @param score, score obtained in the midterm exam
     */
    public Midterm(int total, int score)
    {
        super(total, score); // Call the constructor of the superclass
    }
    /**
     * Returns a string representation of the Midterm object
     *
     * @return string describing the midterm score and total score
     */
    public String toString()
    {
        return "Midterm score= " + score + "\nTotal score= " + total;
    }
}
