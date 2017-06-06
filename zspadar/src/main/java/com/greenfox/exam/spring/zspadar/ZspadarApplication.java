package com.greenfox.exam.spring.zspadar;

import com.greenfox.exam.spring.zspadar.model.Question;
import com.greenfox.exam.spring.zspadar.model.QuestionHolder;
import com.greenfox.exam.spring.zspadar.repository.QuestionHolderRepository;
import com.greenfox.exam.spring.zspadar.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZspadarApplication implements CommandLineRunner{
	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	QuestionHolderRepository questionHolderRepository;

	public static void main(String[] args) {
		SpringApplication.run(ZspadarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepository.save(new Question("What is the color code of Green Fox?"));
		questionRepository.save(new Question("When was Green Fox founded?(yyyy.mm.)"));
		questionRepository.save(new Question("When did your course start?"));
		questionRepository.save(new Question("What type of dog Barbi has?"));
		questionRepository.save(new Question("What is HerrNorbert's favourite color?"));
		questionRepository.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
		questionRepository.save(new Question("How many mentors teach at Green Fox at this moment?"));
		questionRepository.save(new Question("What was the name of the first Green Fox class?"));
		questionRepository.save(new Question("How many likes do we have on facebook?"));
		questionRepository.save(new Question("What is Tojas's horoscope?"));

		questionHolderRepository.save(new QuestionHolder(questionRepository.findAll()));
	}

}
