package com.question.questionservice.dao.impl;

import com.question.questionservice.dao.QuestionDao;
import com.question.questionservice.entity.Question;
import com.question.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question getQuestion(String id) {
        return questionRepository.findById(id).get();
    }


    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }



    @Override
    public List<Question> getQueByQuizId(String id) {
        return questionRepository.findByQuizId(id);
    }
}
