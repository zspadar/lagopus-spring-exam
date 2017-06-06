package com.greenfox.exam.spring.zspadar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@Entity
@Table(name = "answer")
@Getter
@Setter
public class Answer {
  @Id
  @GeneratedValue
  private Long id;

  private String answer;

  public Answer() {
  }

}
