package de.anhquan.deutschlernen.services;

import de.anhquan.deutschlernen.models.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizPool quizPool;

    public Quiz generate(int numberOfQuestions){

        Quiz q = new Quiz();

        for(int i=0;i<numberOfQuestions;i++){
            q.addQuestion(quizPool.getQuestionByIndex(i));
        }
        return q;
    }
}
