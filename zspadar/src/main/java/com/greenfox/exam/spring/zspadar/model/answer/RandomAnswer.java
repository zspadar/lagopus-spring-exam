package com.greenfox.exam.spring.zspadar.model.answer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@Entity
@Table(name = "randomAnswer")
@Getter
@Setter
public class RandomAnswer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String answer;

  public RandomAnswer() {
  }

  public RandomAnswer(Long id, String answer) {
    this.id = id;
    this.answer = answer;
  }

}
