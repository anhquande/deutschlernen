package de.anhquan.deutschlernen.models;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private List<Question> questions;

    public Quiz(){
        questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Quiz addQuestion(Question question){
        this.questions.add(question);
        return this;
    }
}
