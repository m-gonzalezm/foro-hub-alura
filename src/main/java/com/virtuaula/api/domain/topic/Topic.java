package com.virtuaula.api.domain.topic;

import com.virtuaula.api.domain.course.Course;
import com.virtuaula.api.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topics")
@Entity
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime creationDate;
    @Enumerated(EnumType.STRING)
    private Status status;
//    @ManyToOne
//    private Course course;
//    @ManyToOne
//    private User author;
}
