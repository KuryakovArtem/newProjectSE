package com.crm.crm.controllers;

import com.crm.crm.entity.Answer;
import com.crm.crm.entity.Test;
import com.crm.crm.repos.AnswerRepository;
import com.crm.crm.repos.QuestionRepository;
import com.crm.crm.repos.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AnswerController {
    @Autowired
    private TestRepository testRepository;
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private QuestionRepository questionRepository;

//    @GetMapping("/getAnswer")
//    public Object getAnswer(@PathVariable(value = "id") Long testId,
//                            @PathVariable(value = "userNickName") String nickName){
//        MapSqlParameterSource map = new MapSqlParameterSource();
//        if (!testRepository.existsById(testId)) {
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//        Optional<Test> test = testRepository.findById(testId);
//        Answer answer = answerRepository.findByTestId(test.get().getTestId());
//        map.addValue("questionNumber", questionRepository.getQuestionNumberByTestId(testId));
//
//    }

//    @GetMapping("/getAnswer")
//    public Object getAnswer(@PathVariable(value = "id") Long testId,
//                           @PathVariable(value = "userNickName") String nickName){
//        return questionRepository.getQuestionNumberByTestId(testId);
//
//
//    }



}
