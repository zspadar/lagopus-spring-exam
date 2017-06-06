package com.greenfox.exam.spring.zspadar.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@Getter
@Setter
public class RandomQuestions {
  List<Question> randomquestions;

  public RandomQuestions(
      List<Question> randomquestions) {
    this.randomquestions = randomquestions;
  }
}
