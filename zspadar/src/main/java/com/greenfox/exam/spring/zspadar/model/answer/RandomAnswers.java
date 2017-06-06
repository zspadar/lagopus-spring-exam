package com.greenfox.exam.spring.zspadar.model.answer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@Getter
@Setter
public class RandomAnswers {
  private int id;
  private List<RandomAnswer> answers = new ArrayList<>();

  public RandomAnswers(List<Answer> answers) {
    for(Answer answer : answers) {
      this.answers.add(new RandomAnswer(answer.getId(), answer.getAnswer()));
    }
    this.id = 1;
  }

}
