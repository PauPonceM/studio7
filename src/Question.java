public abstract class Question {
private String question;
private boolean correct;

private int grade;

public Question (String aQuestion, boolean aCorrect, int aGrade){
    question = aQuestion;
    correct= aCorrect;
    grade= aGrade;
}

public abstract String askQuestion();

    public abstract void getUserAnswer();

public abstract int gradeAnswer();

}
