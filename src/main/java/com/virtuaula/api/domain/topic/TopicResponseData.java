package com.virtuaula.api.domain.topic;

import java.time.LocalDateTime;

public record TopicResponseData(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate,
        Status status) {
}
