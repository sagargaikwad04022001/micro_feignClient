package com.question.questionservice.repository;

import com.question.questionservice.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionRepository extends MongoRepository<Question,String> {
    List<Question> findByQuizId(String id);
}
