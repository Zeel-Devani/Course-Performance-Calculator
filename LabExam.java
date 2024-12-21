/**
 * The LabExam class represents a lab exam, extending Exam class.
 */
public class LabExam extends Exam
{
    /**
     * Constructs a LabExam with the specified total and score.
     *
     * @param total, total possible score for the lab exam
     * @param score, score obtained in the lab exam
     */
    public LabExam(int total, int score)
    {
        super(total, score); // Call the constructor of the superclass
    }

    /**
     * Returns a string representation of the LabExam object
     *
     * @return  string describing the lab exam score and total score
     */
    public String toString()
    {
        return "Lab exam= " + score +"\n Total score= " + total;
    }
}
