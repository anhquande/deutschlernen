package de.anhquan.deutschlernen.models;

public class BooleanQuestion extends Question {

    private boolean correctAnswer;

    private boolean answer;

    public BooleanQuestion(String header, boolean correctAnswer){
        setHeader(header);
        setCorrectAnswer(correctAnswer);
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
