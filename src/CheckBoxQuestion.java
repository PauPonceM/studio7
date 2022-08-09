import java.util.ArrayList;


import java.util.ArrayList;


public class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String questionString,
                            ArrayList<String> setOfPossibleAnswers,
                            ArrayList<String> sublistOfCorrectAnswers){
        this.setQuestionString(questionString);
        this.setSetOfPossibleAnswers(setOfPossibleAnswers);
        this.setSublistOfCorrectAnswers(sublistOfCorrectAnswers);
    }
}
