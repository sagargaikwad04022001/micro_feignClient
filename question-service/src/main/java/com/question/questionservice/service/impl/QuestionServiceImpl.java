package com.question.questionservice.service.impl;


import com.question.questionservice.entity.Question;
import com.question.questionservice.repository.QuestionRepository;
import com.question.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepo;
    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Question add(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepo.findAll();
    }

    @Override
    public Question getById(String id) {
        return questionRepo.findById(id).orElseThrow(()->new RuntimeException("Question Not Found"));
    }

    @Override
    public List<Question> getQuestionByQuizId(String quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}