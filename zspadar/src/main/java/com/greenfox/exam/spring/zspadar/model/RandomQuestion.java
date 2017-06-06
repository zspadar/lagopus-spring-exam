package com.greenfox.exam.spring.zspadar.model;

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
@Table(name = "randomQuestion")
@Getter
@Setter
public class RandomQuestion {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String question;

  public RandomQuestion(Long id, String question) {
    this.id = id;
    this.question = question;
  }

  public RandomQuestion() {
  }

}
