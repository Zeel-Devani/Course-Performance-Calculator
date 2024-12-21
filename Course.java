
/**
 * The Course class represents a course that can contain assignments, quizzes,
 * midterm exams, lab exams, and final exam.
 */

public class Course
{
    private String courseName; // name

    private Assignment[] assignments; // Array to store assignments

    private int assignmentIdx = 0; // Index for next assignment

    private Quiz[] quizzes; // Array to store Quizzes

    private int quizIdx = 0; // Index for next quiz

    private Midterm midterm; // Midterm exam

    private LabExam labExam1; // Lab exam 1
    private LabExam labExam2; // Lab exam 2

    private FinalExam finalExam; // Final exam

    /**
     * Constructs a Course with the specified name and capacity for assignments and quizzes.
     *
     * @param name, name of the course
     * @param numAssignments, maximum number of assignments
     * @param numQuizzes, maximum number of quizzes
     */
    public Course(String name, int numAssignments, int numQuizzes)
    {
        this.courseName = name;
        assignments = new Assignment[numAssignments];
        quizzes = new Quiz[numQuizzes];
    }

    /**
     * Adds an assignment to the course.
     *
     * @param total, total score for the assignment
     * @param score, score obtained for the assignment
     */
    public void addAssignment(int total, int score)
    {
        if (assignmentIdx < assignments.length)
        {
            assignments[assignmentIdx] = new Assignment(total, score);
            assignmentIdx++;
        }
        else
        {
            System.out.println("Assignment list is full");
        }
    }

    /**
     * Adds a quiz to the course.
     *
     * @param total, total score for the quiz
     * @param score, score obtained for the quiz
     */
    public void addQuiz(int total, int score)
    {
        if (quizIdx < quizzes.length)
        {
            quizzes[quizIdx] = new Quiz(total, score);
            quizIdx++;
        }
        else
        {
            System.out.println("Quiz list is full");
        }
    }

    /**
     * Adds a midterm exam to the course.
     *
     * @param total, total score for the midterm
     * @param score, score obtained for the midterm
     */
    public void addMidterm(int total, int score)
    {
        if (midterm == null)
        {
            midterm = new Midterm(total, score);
        }
        else
        {
            System.out.println("Invalid. Only 1 mid-term should be there");
        }
    }

    /**
     * Adds a lab exam to the course.
     *
     * @param examNumber, number of the lab exam (1 or 2)
     * @param total, total score for the lab exam
     * @param score, score obtained for the lab exam
     */

    public void addLabExam(int examNumber, int total, int score)
    {
        if (examNumber == 1)
        {
            labExam1 = new LabExam(total, score);
        }
        else if (examNumber == 2) {
            labExam2 = new LabExam(total, score);
        }
        else
        {
            System.out.println("Invalid. Only 2 Lab-exam should be there");
        }
    }
    /**
     * Adds a final exam to the course.
     */

    public void addFinalExam(int total, int score) {
        finalExam = new FinalExam(total, score);
    }

    /**
     * Calculates the final grade for the course based on assignments,
     * quizzes, midterm, lab exams, and final exam.
     *
     * @return the calculated final grade as a double
     */
    public double getFinalGrade()
    {
        int assignmentScore = 0; // Total score from assignments
        int quizScore = 0; // Total score from quiz
        int assignmentTotal = 0; // Total possible score from assignments
        int quizTotal = 0; // Total possible score from quiz

        for (int i = 0; i < assignmentIdx; i++)
        {
            assignmentScore += assignments[i].getScore();
            assignmentTotal += assignments[i].getTotal();
        }

        for (int i = 0; i < quizIdx; i++)
        {
            quizScore += quizzes[i].getScore();
            quizTotal += quizzes[i].getTotal();
        }
        double midtermScore = 0;
        if (midterm != null)
        {
            midtermScore = midterm.getPercentage();
        }
        double labExam1Score = 0;
        if (labExam1 != null)
        {
            labExam1Score = labExam1.getPercentage();
        }
        double labExam2Score = 0;
        if (labExam2 != null)
        {
            labExam2Score = labExam2.getPercentage();
        }
        double finalExamScore = 0;
        if (finalExam != null)
        {
            finalExamScore = finalExam.getPercentage();
        }

        /* Calculating Final Score */

        return (((double) assignmentScore / assignmentTotal) * 15) + (((double) quizScore / quizTotal) * 5) + midtermScore * 0.15 + labExam1Score * 0.05 + labExam2Score * 0.15 + finalExamScore * 0.45;


    }

    /**
     * Returns the name of the course.
     *
     * @return  name of the course
     */
    public String getCourseName()
    {
        return courseName;
    }

    // Using StringBuilder for toString output

    /**
     * Returns a string representation of the Course object.
     *
     * @return string summarizing the course information
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        // Basic course information
        sb.append("Course Name: ").append(courseName).append("\n");

        // Assignments
        sb.append("Assignments:\n");
        for (int i = 0; i < assignmentIdx; i++)
        {
            sb.append(assignments[i].toString()).append("\n");
        }

        // Quizzes
        sb.append("Quizzes:\n");
        for (int i = 0; i < quizIdx; i++)
        {
            sb.append(quizzes[i].toString()).append("\n");
        }

        // Midterm
        if (midterm != null)
        {
            sb.append("Midterm:\n");
            sb.append(midterm.toString()).append("\n");
        }
        else
        {
            sb.append("Midterm: INVALID\n");
        }

        // Lab exams
        if (labExam1 != null)
        {
            sb.append("Lab Exam 1:\n");
            sb.append(labExam1.toString()).append("\n");
        }
        else
        {
            sb.append("Lab Exam 1: INVALID\n");
        }

        if (labExam2 != null)
        {
            sb.append("Lab Exam 2:\n");
            sb.append(labExam2.toString()).append("\n");
        }
        else
        {
            sb.append("Lab Exam 2: INVALID\n");
        }

        // Final exam
        if (finalExam != null)
        {
            sb.append("Final Exam:\n");
            sb.append(finalExam.toString()).append("\n");
        }
        else
        {
            sb.append("Final Exam: INVALID\n");
        }

        return sb.toString();
    }
}
