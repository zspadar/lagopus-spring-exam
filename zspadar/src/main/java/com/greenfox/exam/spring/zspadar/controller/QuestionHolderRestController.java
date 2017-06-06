package com.greenfox.exam.spring.zspadar.controller;

import com.greenfox.exam.spring.zspadar.model.Question;
import com.greenfox.exam.spring.zspadar.model.RandomQuestions;
import com.greenfox.exam.spring.zspadar.repository.QuestionRepository;
import com.greenfox.exam.spring.zspadar.repository.RandomQuestionRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
//    List<Question> firstFiveOfShuffled = wholeList.subList(0,5);
//    RandomQuestions randomQuestions = (RandomQuestions) firstFiveOfShuffled;


    return new RandomQuestions(wholeList.subList(0,5));
  }

}
