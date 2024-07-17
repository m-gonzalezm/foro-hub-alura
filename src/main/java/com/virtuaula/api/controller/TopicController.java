package com.virtuaula.api.controller;

import com.virtuaula.api.domain.topic.TopicRepository;
import com.virtuaula.api.domain.topic.TopicResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicRepository repository;

//    public TopicController(TopicRepository repository) {
//        this.repository = repository;
//    }

    @PostMapping
    public ResponseEntity<TopicResponseData> createTopic() {
        return (ResponseEntity<TopicResponseData>) ResponseEntity.ok();
    }

    //public ResponseEntity<Page<TopicListedData>>
}
