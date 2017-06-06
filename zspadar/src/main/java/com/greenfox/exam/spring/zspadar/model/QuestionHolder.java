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
@Table(name = "QuestionHolder")
@Getter
@Setter
public class QuestionHolder {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Iterable<Question> questions;

  public QuestionHolder(Iterable<Question> questions) {
    this.questions = questions;
  }

  public QuestionHolder() {
  }

}
