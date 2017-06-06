package com.greenfox.exam.spring.zspadar.model;

import java.util.List;
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

  private List<Question> questions;

  public QuestionHolder() {
  }

  public QuestionHolder(List<Question> questions) {
    this.questions = questions;
  }
}
