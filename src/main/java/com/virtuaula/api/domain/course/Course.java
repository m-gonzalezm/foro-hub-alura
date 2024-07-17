package com.virtuaula.api.domain.course;

import com.virtuaula.api.domain.topic.Topic;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "courses")
@Entity
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Topic> topics;
}
