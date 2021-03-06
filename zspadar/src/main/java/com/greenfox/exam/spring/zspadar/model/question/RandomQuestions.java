package com.greenfox.exam.spring.zspadar.model.question;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */

@Getter
@Setter
public class RandomQuestions {
  private int id;
  private List<RandomQuestion> questions = new ArrayList<>();

  public RandomQuestions(List<Question> questions) {
    for(Question question : questions) {
      this.questions.add(new RandomQuestion(question.getId(), question.getQuestion()));
    }
    this.id = 1;
  }


}
