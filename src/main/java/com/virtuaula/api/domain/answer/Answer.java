package com.virtuaula.api.domain.answer;

import com.virtuaula.api.domain.topic.Topic;
import com.virtuaula.api.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "answers")
@Entity
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
    private Topic topic;
    private LocalDateTime creationDate;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "author_id")
//    private User author;
    private Boolean solution;
}
