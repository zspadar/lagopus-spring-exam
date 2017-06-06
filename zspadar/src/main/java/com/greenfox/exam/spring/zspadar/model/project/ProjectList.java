package com.greenfox.exam.spring.zspadar.model.project;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
@Getter
@Setter
public class ProjectList {
  private List<Project> projectList;

  public ProjectList(
      List<Project> projectList) {
    this.projectList = projectList;
  }
  
}
