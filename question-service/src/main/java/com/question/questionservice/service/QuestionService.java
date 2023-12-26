package com.question.questionservice.service;

import com.question.questionservice.entity.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> getAll();

    Question getById(String id);

    List<Question> getQuestionByQuizId(String quizId);
}