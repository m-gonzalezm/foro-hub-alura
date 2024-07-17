package com.virtuaula.api.domain.profile;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "profiles")
@Entity
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
