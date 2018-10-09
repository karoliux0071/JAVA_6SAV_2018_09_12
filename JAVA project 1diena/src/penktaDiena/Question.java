package penktaDiena;

import java.util.List;

public class Question {
    private String question ;
    private String answer;
    private List<String> options;

    public Question(String question, String answer, List<String> options) {   //alt + insert
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getQuestion() {   //alt + insert
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
