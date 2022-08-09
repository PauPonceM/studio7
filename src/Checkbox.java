public class Checkbox extends Question{

    public Checkbox(String aQuestion, boolean aCorrect, int aGrade) {
        super(aQuestion, aCorrect, aGrade);
    }

    @Override
    public String askQuestion() {
        return null;
    }

    @Override
    public void getUserAnswer() {

    }

    @Override
    public int gradeAnswer() {
        return 0;
    }
}
