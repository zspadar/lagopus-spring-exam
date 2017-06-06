package com.greenfox.exam.spring.zspadar.controller;

import com.greenfox.exam.spring.zspadar.model.Question;
import com.greenfox.exam.spring.zspadar.model.QuestionHolder;
import com.greenfox.exam.spring.zspadar.repository.QuestionHolderRepository;
import com.greenfox.exam.spring.zspadar.repository.QuestionRepository;
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
  QuestionHolderRepository questionHolderRepository;

  @GetMapping(value = "/questions")
  public QuestionHolder getFiveRandomQuestions() {
    List<Question> wholeList = (List<Question>) questionRepository.findAll();
    Collections.shuffle(wholeList);
    List<Question> firstFiveOfShuffled = wholeList.subList(0,5);
    return new QuestionHolder(firstFiveOfShuffled);
  }

}
