package com.greenfox.exam.spring.zspadar.controller;

import com.greenfox.exam.spring.zspadar.model.answer.Answer;
import com.greenfox.exam.spring.zspadar.model.question.Question;
import com.greenfox.exam.spring.zspadar.model.answer.RandomAnswers;
import com.greenfox.exam.spring.zspadar.model.question.RandomQuestions;
import com.greenfox.exam.spring.zspadar.repository.QuestionRepository;
import com.greenfox.exam.spring.zspadar.repository.RandomQuestionRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@RestController
public class QuestionHolderRestController {
  @Autowired
  QuestionRepository questionRepository;

  @Autowired
  RandomQuestionRepository randomQuestionRepository;

  RandomQuestions randomQuestions;
  Question question;


  @GetMapping(value = "/questions")
  public RandomQuestions getFiveRandomQuestions() {
    List<Question> wholeList = (List<Question>) questionRepository.findAll();
    Collections.shuffle(wholeList);
    return new RandomQuestions(wholeList.subList(0,5));
  }

  @PostMapping(value = "/answers")
  public RandomAnswers getTheFiveMatchingAnswers(@RequestBody Answer answer) {

  }

}
