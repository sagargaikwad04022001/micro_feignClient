package com.question.questionservice.dao;

import com.question.questionservice.entity.Question;

import java.util.List;

public interface QuestionDao {
    Question saveQuestion(Question question);
    Question getQuestion(String id);
    List<Question> getAllQuestions();

   List<Question>  getQueByQuizId(String id);
}
