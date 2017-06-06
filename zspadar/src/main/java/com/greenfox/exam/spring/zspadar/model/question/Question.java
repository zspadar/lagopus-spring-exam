package com.greenfox.exam.spring.zspadar.model.question;

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
@Table(name = "Questions")
@Getter
@Setter
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String question;

  public Question() {
  }

  public Question(String question) {
    this.question = question;
  }

}
