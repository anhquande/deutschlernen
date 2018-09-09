package de.anhquan.deutschlernen.services;

import de.anhquan.deutschlernen.models.BooleanQuestion;
import de.anhquan.deutschlernen.models.Question;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizPool {

    private static List<Question> questions;

    static {
        questions = new ArrayList<>();
        questions.add(new BooleanQuestion("Is the earth round", true));
        questions.add(new BooleanQuestion("Is the sky blue", true));
        questions.add(new BooleanQuestion("Is the blood green", false));
        questions.add(new BooleanQuestion("Are you human", true));
    }

    public Question getQuestionByIndex(int index){
        return questions.get(index);
    }

    public int getSize(){
        return questions.size();
    }
}
