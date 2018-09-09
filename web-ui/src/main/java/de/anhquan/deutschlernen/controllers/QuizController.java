package de.anhquan.deutschlernen.controllers;

import de.anhquan.deutschlernen.models.Quiz;
import de.anhquan.deutschlernen.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    @RequestMapping(value = "/quiz/{n}", method = GET)
    @ResponseBody
    public String randomQuiz(@PathVariable("n") int n){

        Quiz q = quizService.generate(n);
        return q.getQuestions().get(new Random().nextInt(n-1)).getHeader();
    }
}
