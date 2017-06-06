package com.greenfox.exam.spring.zspadar.repository;

import com.greenfox.exam.spring.zspadar.model.Question;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zsuzsanna.padar on 2017. 06. 06..
 */
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
