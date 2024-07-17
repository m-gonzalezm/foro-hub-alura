package com.virtuaula.api.domain.topic;

import java.time.LocalDateTime;

public record TopicListedData(Long id, String title, String message, LocalDateTime creationDate, Status status) {
    public TopicListedData(Topic topic) {
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreationDate(), topic.getStatus());
    }
}
