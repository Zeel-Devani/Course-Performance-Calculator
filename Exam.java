/**
 * The Exam class represents any ggiven exam with a total score and a score obtained.
 */

public class Exam
{
    protected int total; // total possible score
    protected int score; // obtained score

    /**
     * Constructs an Exam
     *
     * @param total, total possible score for the exam
     * @param score, score obtained in the exam
     */
    public Exam(int total, int score)
    {
        this.total = total;
        this.score = score;
    }

    /**
     * Calculates the percentage score for the exam.
     *
     * @return percentage of the score obtained out of the total
     */
    public double getPercentage()
    {
        return (double)score / total * 100;
    }

    /* Regression Test */


    /**
     * Main method for regression testing of the Exam class.
     */

    public static void main(String[] args)
    {
        Exam exam = new Exam(50,50);
        // Check if the total is correctly set
        if(exam.total != 50)
        {
            System.out.println("Error in creation, int total");
        }
        // Check if the score is correctly set
        if (exam.score != 50)
        {
            System.out.println("Error in creation, int score");
        }
        // Check if the percentage calculation is correct
        if (exam.getPercentage() != 100)
        {
            System.out.println("Error in getPercentage");
        }
    }

}
